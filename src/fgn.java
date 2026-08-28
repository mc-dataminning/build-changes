import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fgn {
   @Nullable
   private static fgu a;

   public static void a() {
      if (a != null) {
         b();
         fgu.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fgq $$0) {
      RenderSystem.assertOnRenderThread();
      fgu $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fgq $$0) {
      RenderSystem.assertOnRenderThread();
      fgu $$1 = c($$0);
      $$1.c();
   }

   private static fgu c(fgq $$0) {
      fgu $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fgu a(fgw $$0) {
      fgu $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fgu $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
