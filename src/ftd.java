import com.mojang.blaze3d.systems.RenderSystem;

public interface ftd {
   ftd a = new ftd() {
      @Override
      public void a(erv $$0, ggu $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ggs.e);
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
   ftd b = new ftd() {
      @Override
      public void a(erv $$0, ggu $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fve::u);
         RenderSystem.setShaderTexture(0, ggs.f);
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
   ftd c = new ftd() {
      @Override
      public void a(erv $$0, ggu $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ggs.f);
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
   ftd d = new ftd() {
      @Override
      public void a(erv $$0, ggu $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, ggs.f);
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
   ftd e = new ftd() {
      @Override
      public void a(erv $$0, ggu $$1) {
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
   ftd f = new ftd() {
      @Override
      public void a(erv $$0, ggu $$1) {
      }

      @Override
      public void a(esc $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(erv var1, ggu var2);

   void a(esc var1);
}
