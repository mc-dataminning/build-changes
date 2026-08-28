import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fen {
   @Nullable
   private static feu a;

   public static void a() {
      if (a != null) {
         b();
         feu.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(feq $$0) {
      RenderSystem.assertOnRenderThread();
      feu $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(feq $$0) {
      RenderSystem.assertOnRenderThread();
      feu $$1 = c($$0);
      $$1.c();
   }

   private static feu c(feq $$0) {
      feu $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static feu a(few $$0) {
      feu $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(feu $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
