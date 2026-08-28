import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fbe {
   @Nullable
   private static fbl a;

   public static void a() {
      if (a != null) {
         b();
         fbl.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fbh $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(fbh $$0) {
      fbl $$1 = d($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fbh $$0) {
      fbl $$1 = d($$0);
      $$1.c();
   }

   private static fbl d(fbh $$0) {
      RenderSystem.assertOnRenderThread();
      fbl $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fbl a(fbn $$0) {
      fbl $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fbl $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
