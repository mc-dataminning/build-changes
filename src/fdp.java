import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fdp {
   @Nullable
   private static fdw a;

   public static void a() {
      if (a != null) {
         b();
         fdw.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fds $$0) {
      RenderSystem.assertOnRenderThread();
      fdw $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fds $$0) {
      RenderSystem.assertOnRenderThread();
      fdw $$1 = c($$0);
      $$1.c();
   }

   private static fdw c(fds $$0) {
      fdw $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fdw a(fdy $$0) {
      fdw $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fdw $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
