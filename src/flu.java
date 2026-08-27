import com.mojang.blaze3d.systems.RenderSystem;

public interface flu {
   flu a = new flu() {
      @Override
      public void a(ele $$0, fzb $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyz.e);
         $$0.a(elo.b.h, elh.l);
      }

      @Override
      public void a(ell $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   flu b = new flu() {
      @Override
      public void a(ele $$0, fzb $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fnt::u);
         RenderSystem.setShaderTexture(0, fyz.f);
         $$0.a(elo.b.h, elh.l);
      }

      @Override
      public void a(ell $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   flu c = new flu() {
      @Override
      public void a(ele $$0, fzb $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyz.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(elo.b.h, elh.l);
      }

      @Override
      public void a(ell $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   flu d = new flu() {
      @Override
      public void a(ele $$0, fzb $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyz.f);
         $$0.a(elo.b.h, elh.l);
      }

      @Override
      public void a(ell $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   flu e = new flu() {
      @Override
      public void a(ele $$0, fzb $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(ell $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   flu f = new flu() {
      @Override
      public void a(ele $$0, fzb $$1) {
      }

      @Override
      public void a(ell $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(ele var1, fzb var2);

   void a(ell var1);
}
