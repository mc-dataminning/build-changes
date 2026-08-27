import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class enx {
   @Nullable
   private static eoe a;

   public static void a() {
      if (a != null) {
         b();
         eoe.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(enw.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(enw.b $$0) {
      eoe $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(enw.b $$0) {
      eoe $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static eoe d(enw.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         eoe $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static eoe a(eog $$0) {
      eoe $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(eoe $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
