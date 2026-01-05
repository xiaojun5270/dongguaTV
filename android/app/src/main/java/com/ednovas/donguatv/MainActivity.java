package com.ednovas.donguatv;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // 对于刘海屏/打孔屏，允许全屏视频延伸到切口区域
        // 注意：这只影响全屏时，正常情况下系统会自动避开刘海
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            WindowManager.LayoutParams lp = getWindow().getAttributes();
            lp.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
            getWindow().setAttributes(lp);
        }
        
        // 状态栏设为黑色（与网站标题栏颜色匹配）
        getWindow().setStatusBarColor(android.graphics.Color.BLACK);
    }
}

