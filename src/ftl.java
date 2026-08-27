import com.mojang.blaze3d.systems.RenderSystem;

public interface ftl {
   ftl a = new ftl() {
      @Override
      public void a(esc $$0, ghc $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gha.e);
         $$0.a(esm.b.h, esf.l);
      }

      @Override
      public void a(esj $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   ftl b = new ftl() {
      @Override
      public void a(esc $$0, ghc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fvm::u);
         RenderSystem.setShaderTexture(0, gha.f);
         $$0.a(esm.b.h, esf.l);
      }

      @Override
      public void a(esj $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   ftl c = new ftl() {
      @Override
      public void a(esc $$0, ghc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gha.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(esm.b.h, esf.l);
      }

      @Override
      public void a(esj $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   ftl d = new ftl() {
      @Override
      public void a(esc $$0, ghc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gha.f);
         $$0.a(esm.b.h, esf.l);
      }

      @Override
      public void a(esj $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   ftl e = new ftl() {
      @Override
      public void a(esc $$0, ghc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(esj $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   ftl f = new ftl() {
      @Override
      public void a(esc $$0, ghc $$1) {
      }

      @Override
      public void a(esj $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(esc var1, ghc var2);

   void a(esj var1);
}
