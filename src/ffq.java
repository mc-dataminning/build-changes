import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ffq {
   @Nullable
   private static ffx a;

   public static void a() {
      if (a != null) {
         b();
         ffx.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fft $$0) {
      RenderSystem.assertOnRenderThread();
      ffx $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fft $$0) {
      RenderSystem.assertOnRenderThread();
      ffx $$1 = c($$0);
      $$1.c();
   }

   private static ffx c(fft $$0) {
      ffx $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static ffx a(ffz $$0) {
      ffx $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(ffx $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
