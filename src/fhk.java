import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fhk {
   @Nullable
   private static fhr a;

   public static void a() {
      if (a != null) {
         b();
         fhr.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fhn $$0) {
      RenderSystem.assertOnRenderThread();
      fhr $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fhn $$0) {
      RenderSystem.assertOnRenderThread();
      fhr $$1 = c($$0);
      $$1.c();
   }

   private static fhr c(fhn $$0) {
      fhr $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fhr a(fht $$0) {
      fhr $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fhr $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
