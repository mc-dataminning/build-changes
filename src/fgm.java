import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fgm {
   @Nullable
   private static fgt a;

   public static void a() {
      if (a != null) {
         b();
         fgt.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fgp $$0) {
      RenderSystem.assertOnRenderThread();
      fgt $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fgp $$0) {
      RenderSystem.assertOnRenderThread();
      fgt $$1 = c($$0);
      $$1.c();
   }

   private static fgt c(fgp $$0) {
      fgt $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fgt a(fgv $$0) {
      fgt $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fgt $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
