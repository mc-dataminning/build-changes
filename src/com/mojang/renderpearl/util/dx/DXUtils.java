package com.mojang.renderpearl.util.dx;

public class DXUtils {
   public static boolean failure(final int hresult) {
      return hresult < 0;
   }

   public static void crashIfFailure(final int hresult) {
      if (failure(hresult)) {
         throw new IllegalStateException("HRESULT failure " + hresultString(hresult));
      }
   }

   private static String hresultString(final int hresult) {
      return switch (hresult) {
         case -2005270527 -> "DXGI_ERROR_INVALID_CALL";
         case -2005270526 -> "DXGI_ERROR_NOT_FOUND";
         case -2005270525 -> "DXGI_ERROR_MORE_DATA";
         case -2005270524 -> "DXGI_ERROR_UNSUPPORTED";
         case -2005270523 -> "DXGI_ERROR_DEVICE_REMOVED";
         case -2005270522 -> "DXGI_ERROR_DEVICE_HUNG";
         case -2005270521 -> "DXGI_ERROR_DEVICE_RESET";
         case -2005270518 -> "DXGI_ERROR_WAS_STILL_DRAWING";
         case -2005270517 -> "DXGI_ERROR_FRAME_STATISTICS_DISJOINT";
         case -2005270516 -> "DXGI_ERROR_GRAPHICS_VIDPN_SOURCE_IN_USE";
         case -2005270496 -> "DXGI_ERROR_DRIVER_INTERNAL_ERROR";
         case -2005270495 -> "DXGI_ERROR_NONEXCLUSIVE";
         case -2005270494 -> "DXGI_ERROR_NOT_CURRENTLY_AVAILABLE";
         case -2005270493 -> "DXGI_ERROR_REMOTE_CLIENT_DISCONNECTED";
         case -2005270492 -> "DXGI_ERROR_REMOTE_OUTOFMEMORY";
         case -2005270491 -> "DXGI_ERROR_MODE_CHANGE_IN_PROGRESS";
         case -2005270490 -> "DXGI_ERROR_ACCESS_LOST";
         case -2005270489 -> "DXGI_ERROR_WAIT_TIMEOUT";
         case -2005270488 -> "DXGI_ERROR_SESSION_DISCONNECTED";
         case -2005270487 -> "DXGI_ERROR_RESTRICT_TO_OUTPUT_STALE";
         case -2005270486 -> "DXGI_ERROR_CANNOT_PROTECT_CONTENT";
         case -2005270485 -> "DXGI_ERROR_ACCESS_DENIED";
         case -2005270484 -> "DXGI_ERROR_NAME_ALREADY_EXISTS";
         case -2005270483 -> "DXGI_ERROR_SDK_COMPONENT_MISSING";
         case -2005270482 -> "DXGI_ERROR_NOT_CURRENT";
         case -2005270480 -> "DXGI_ERROR_HW_PROTECTION_OUTOFMEMORY";
         case -2005270479 -> "DXGI_ERROR_DYNAMIC_CODE_POLICY_VIOLATION";
         case -2005270478 -> "DXGI_ERROR_NON_COMPOSITED_UI";
         case -2005270477 -> "DXGI_ERROR_CACHE_CORRUPT";
         case -2005270476 -> "DXGI_ERROR_CACHE_FULL";
         case -2005270475 -> "DXGI_ERROR_CACHE_HASH_COLLISION";
         case -2005270474 -> "DXGI_ERROR_ALREADY_EXISTS";
         case -2005270428 -> "DXGI_ERROR_MPO_UNPINNED";
         case -2005270427 -> "DXGI_ERROR_SETDISPLAYMODE_REQUIRED";
         case -2004877311 -> "DXCORE_ERROR_EVENT_NOT_UNREGISTERED";
         case -2004811775 -> "PRESENTATION_ERROR_LOST";
         case 142213129 -> "DXGI_STATUS_UNOCCLUDED";
         case 142213130 -> "DXGI_STATUS_DDA_WAS_STILL_DRAWING";
         case 142213167 -> "DXGI_STATUS_PRESENT_REQUIRED";
         default -> "Unknown(" + Integer.toHexString(hresult) + ")";
      };
   }
}
