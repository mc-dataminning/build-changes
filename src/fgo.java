import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fgo {
   @Nullable
   private static fgv a;

   public static void a() {
      if (a != null) {
         b();
         fgv.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fgr $$0) {
      RenderSystem.assertOnRenderThread();
      fgv $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fgr $$0) {
      RenderSystem.assertOnRenderThread();
      fgv $$1 = c($$0);
      $$1.c();
   }

   private static fgv c(fgr $$0) {
      fgv $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fgv a(fgx $$0) {
      fgv $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fgv $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
