import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class elg {
   @Nullable
   private static eln a;

   public static void a() {
      if (a != null) {
         b();
         eln.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(elf.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(elf.b $$0) {
      eln $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(elf.b $$0) {
      eln $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static eln d(elf.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         eln $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static eln a(elp $$0) {
      eln $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(eln $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
