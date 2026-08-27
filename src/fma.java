import com.mojang.blaze3d.systems.RenderSystem;

public interface fma {
   fma a = new fma() {
      @Override
      public void a(elm $$0, fzh $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzf.e);
         $$0.a(elw.b.h, elp.l);
      }

      @Override
      public void a(elt $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fma b = new fma() {
      @Override
      public void a(elm $$0, fzh $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fnz::u);
         RenderSystem.setShaderTexture(0, fzf.f);
         $$0.a(elw.b.h, elp.l);
      }

      @Override
      public void a(elt $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fma c = new fma() {
      @Override
      public void a(elm $$0, fzh $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzf.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(elw.b.h, elp.l);
      }

      @Override
      public void a(elt $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fma d = new fma() {
      @Override
      public void a(elm $$0, fzh $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzf.f);
         $$0.a(elw.b.h, elp.l);
      }

      @Override
      public void a(elt $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fma e = new fma() {
      @Override
      public void a(elm $$0, fzh $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(elt $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fma f = new fma() {
      @Override
      public void a(elm $$0, fzh $$1) {
      }

      @Override
      public void a(elt $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(elm var1, fzh var2);

   void a(elt var1);
}
