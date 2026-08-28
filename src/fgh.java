import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fgh {
   @Nullable
   private static fgo a;

   public static void a() {
      if (a != null) {
         b();
         fgo.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fgk $$0) {
      RenderSystem.assertOnRenderThread();
      fgo $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fgk $$0) {
      RenderSystem.assertOnRenderThread();
      fgo $$1 = c($$0);
      $$1.c();
   }

   private static fgo c(fgk $$0) {
      fgo $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fgo a(fgq $$0) {
      fgo $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fgo $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
