import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fiy {
   @Nullable
   private static fjf a;

   public static void a() {
      if (a != null) {
         b();
         fjf.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fjb $$0) {
      RenderSystem.assertOnRenderThread();
      fjf $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fjb $$0) {
      RenderSystem.assertOnRenderThread();
      fjf $$1 = c($$0);
      $$1.c();
   }

   private static fjf c(fjb $$0) {
      fjf $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fjf a(fjh $$0) {
      fjf $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fjf $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
