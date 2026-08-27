import com.mojang.blaze3d.systems.RenderSystem;

public interface fmu {
   fmu a = new fmu() {
      @Override
      public void a(emc $$0, gab $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzz.e);
         $$0.a(emm.b.h, emf.l);
      }

      @Override
      public void a(emj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fmu b = new fmu() {
      @Override
      public void a(emc $$0, gab $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fou::u);
         RenderSystem.setShaderTexture(0, fzz.f);
         $$0.a(emm.b.h, emf.l);
      }

      @Override
      public void a(emj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fmu c = new fmu() {
      @Override
      public void a(emc $$0, gab $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzz.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(emm.b.h, emf.l);
      }

      @Override
      public void a(emj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fmu d = new fmu() {
      @Override
      public void a(emc $$0, gab $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fzz.f);
         $$0.a(emm.b.h, emf.l);
      }

      @Override
      public void a(emj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fmu e = new fmu() {
      @Override
      public void a(emc $$0, gab $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(emj $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fmu f = new fmu() {
      @Override
      public void a(emc $$0, gab $$1) {
      }

      @Override
      public void a(emj $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(emc var1, gab var2);

   void a(emj var1);
}
