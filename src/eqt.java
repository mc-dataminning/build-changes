import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class eqt {
   public static ByteBuffer a(int $$0) {
      return MemoryUtil.memAlloc($$0);
   }

   public static void a(Buffer $$0) {
      MemoryUtil.memFree($$0);
   }

   public static String a() {
      return GlStateManager._getString(7936);
   }

   public static String b() {
      return GLX._getCpuInfo();
   }

   public static String c() {
      return GlStateManager._getString(7937);
   }

   public static String d() {
      return GlStateManager._getString(7938);
   }
}
