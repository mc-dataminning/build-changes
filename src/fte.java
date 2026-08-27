import com.mojang.blaze3d.systems.RenderSystem;

public interface fte {
   fte a = new fte() {
      @Override
      public void a(erv $$0, ggv $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ggt.e);
         $$0.a(esf.b.h, ery.l);
      }

      @Override
      public void a(esc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fte b = new fte() {
      @Override
      public void a(erv $$0, ggv $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fvf::u);
         RenderSystem.setShaderTexture(0, ggt.f);
         $$0.a(esf.b.h, ery.l);
      }

      @Override
      public void a(esc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fte c = new fte() {
      @Override
      public void a(erv $$0, ggv $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ggt.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(esf.b.h, ery.l);
      }

      @Override
      public void a(esc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fte d = new fte() {
      @Override
      public void a(erv $$0, ggv $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ggt.f);
         $$0.a(esf.b.h, ery.l);
      }

      @Override
      public void a(esc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fte e = new fte() {
      @Override
      public void a(erv $$0, ggv $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(esc $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fte f = new fte() {
      @Override
      public void a(erv $$0, ggv $$1) {
      }

      @Override
      public void a(esc $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(erv var1, ggv var2);

   void a(esc var1);
}
