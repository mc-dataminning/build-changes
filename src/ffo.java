import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ffo {
   @Nullable
   private static ffv a;

   public static void a() {
      if (a != null) {
         b();
         ffv.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(ffr $$0) {
      RenderSystem.assertOnRenderThread();
      ffv $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(ffr $$0) {
      RenderSystem.assertOnRenderThread();
      ffv $$1 = c($$0);
      $$1.c();
   }

   private static ffv c(ffr $$0) {
      ffv $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static ffv a(ffx $$0) {
      ffv $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(ffv $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
