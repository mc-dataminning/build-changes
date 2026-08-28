import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fbc {
   @Nullable
   private static fbj a;

   public static void a() {
      if (a != null) {
         b();
         fbj.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fbf $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(fbf $$0) {
      fbj $$1 = d($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fbf $$0) {
      fbj $$1 = d($$0);
      $$1.c();
   }

   private static fbj d(fbf $$0) {
      RenderSystem.assertOnRenderThread();
      fbj $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fbj a(fbl $$0) {
      fbj $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fbj $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
