import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fim {
   @Nullable
   private static fit a;

   public static void a() {
      if (a != null) {
         b();
         fit.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fip $$0) {
      RenderSystem.assertOnRenderThread();
      fit $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fip $$0) {
      RenderSystem.assertOnRenderThread();
      fit $$1 = c($$0);
      $$1.c();
   }

   private static fit c(fip $$0) {
      fit $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fit a(fiv $$0) {
      fit $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fit $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
