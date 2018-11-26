package com.ehi.component;

/**
 * time   : 2018/08/09
 *
 * @author : xiaojinzi 30212
 */
public class ComponentConfig {

    private static boolean isDebug = false;

    public static void init(boolean isDebug) {
        ComponentConfig.isDebug = isDebug;
    }

    public static boolean isDebug(){
        return isDebug;
    }

}