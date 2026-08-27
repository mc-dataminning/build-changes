import com.mojang.blaze3d.systems.RenderSystem;

public interface flo {
   flo a = new flo() {
      @Override
      public void a(ela $$0, fyv $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyt.e);
         $$0.a(elk.b.h, eld.l);
      }

      @Override
      public void a(elh $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   flo b = new flo() {
      @Override
      public void a(ela $$0, fyv $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fnn::u);
         RenderSystem.setShaderTexture(0, fyt.f);
         $$0.a(elk.b.h, eld.l);
      }

      @Override
      public void a(elh $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   flo c = new flo() {
      @Override
      public void a(ela $$0, fyv $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyt.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(elk.b.h, eld.l);
      }

      @Override
      public void a(elh $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   flo d = new flo() {
      @Override
      public void a(ela $$0, fyv $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyt.f);
         $$0.a(elk.b.h, eld.l);
      }

      @Override
      public void a(elh $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   flo e = new flo() {
      @Override
      public void a(ela $$0, fyv $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(elh $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   flo f = new flo() {
      @Override
      public void a(ela $$0, fyv $$1) {
      }

      @Override
      public void a(elh $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ela var1, fyv var2);

   void a(elh var1);
}
