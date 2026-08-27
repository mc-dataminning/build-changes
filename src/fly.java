import com.mojang.blaze3d.systems.RenderSystem;

public interface fly {
   fly a = new fly() {
      @Override
      public void a(elk $$0, fzf $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzd.e);
         $$0.a(elu.b.h, eln.l);
      }

      @Override
      public void a(elr $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fly b = new fly() {
      @Override
      public void a(elk $$0, fzf $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fnx::u);
         RenderSystem.setShaderTexture(0, fzd.f);
         $$0.a(elu.b.h, eln.l);
      }

      @Override
      public void a(elr $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fly c = new fly() {
      @Override
      public void a(elk $$0, fzf $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzd.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(elu.b.h, eln.l);
      }

      @Override
      public void a(elr $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fly d = new fly() {
      @Override
      public void a(elk $$0, fzf $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzd.f);
         $$0.a(elu.b.h, eln.l);
      }

      @Override
      public void a(elr $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fly e = new fly() {
      @Override
      public void a(elk $$0, fzf $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(elr $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fly f = new fly() {
      @Override
      public void a(elk $$0, fzf $$1) {
      }

      @Override
      public void a(elr $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(elk var1, fzf var2);

   void a(elr var1);
}
