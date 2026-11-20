package com.mojang.renderpearl.util;

import org.lwjgl.system.Platform;
import org.lwjgl.system.Platform.Architecture;

public class PlatformUtil {
   public static final boolean IS_WINDOWS = Platform.get() == Platform.WINDOWS;
   public static final boolean IS_MACOS = Platform.get() == Platform.MACOSX;
   public static final boolean IS_AARCH64 = Platform.getArchitecture() == Architecture.ARM64;

   public static boolean isAppleSiliconMac(final String renderer) {
      return renderer.startsWith("Apple");
   }
}
