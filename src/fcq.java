import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fcq {
   @Nullable
   private static fcx a;

   public static void a() {
      if (a != null) {
         b();
         fcx.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fct $$0) {
      RenderSystem.assertOnRenderThread();
      fcx $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fct $$0) {
      RenderSystem.assertOnRenderThread();
      fcx $$1 = c($$0);
      $$1.c();
   }

   private static fcx c(fct $$0) {
      fcx $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fcx a(fcz $$0) {
      fcx $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fcx $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
