import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fay {
   @Nullable
   private static fbf a;

   public static void a() {
      if (a != null) {
         b();
         fbf.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fbb $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(fbb $$0) {
      fbf $$1 = d($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fbb $$0) {
      fbf $$1 = d($$0);
      $$1.c();
   }

   private static fbf d(fbb $$0) {
      RenderSystem.assertOnRenderThread();
      fbf $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fbf a(fbh $$0) {
      fbf $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fbf $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
