import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class enq {
   private static final Logger a = LogUtils.getLogger();

   public static void a(int $$0) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glUseProgram($$0);
   }

   public static void a(enr $$0) {
      RenderSystem.assertOnRenderThread();
      $$0.d().a();
      $$0.c().a();
      GlStateManager.glDeleteProgram($$0.a());
   }

   public static int a() throws IOException {
      RenderSystem.assertOnRenderThread();
      int $$0 = GlStateManager.glCreateProgram();
      if ($$0 <= 0) {
         throw new IOException("Could not create shader program (returned program ID " + $$0 + ")");
      } else {
         return $$0;
      }
   }

   public static void b(enr $$0) {
      RenderSystem.assertOnRenderThread();
      $$0.e();
      GlStateManager.glLinkProgram($$0.a());
      int $$1 = GlStateManager.glGetProgrami($$0.a(), 35714);
      if ($$1 == 0) {
         a.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", $$0.c().b(), $$0.d().b());
         a.warn(GlStateManager.glGetProgramInfoLog($$0.a(), 32768));
      }
   }
}
