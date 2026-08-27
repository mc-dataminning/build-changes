import com.mojang.blaze3d.systems.RenderSystem;

public interface fqy {
   fqy a = new fqy() {
      @Override
      public void a(epv $$0, gen $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gel.e);
         $$0.a(eqf.b.h, epy.l);
      }

      @Override
      public void a(eqc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fqy b = new fqy() {
      @Override
      public void a(epv $$0, gen $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fsz::u);
         RenderSystem.setShaderTexture(0, gel.f);
         $$0.a(eqf.b.h, epy.l);
      }

      @Override
      public void a(eqc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fqy c = new fqy() {
      @Override
      public void a(epv $$0, gen $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gel.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eqf.b.h, epy.l);
      }

      @Override
      public void a(eqc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fqy d = new fqy() {
      @Override
      public void a(epv $$0, gen $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gel.f);
         $$0.a(eqf.b.h, epy.l);
      }

      @Override
      public void a(eqc $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fqy e = new fqy() {
      @Override
      public void a(epv $$0, gen $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eqc $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fqy f = new fqy() {
      @Override
      public void a(epv $$0, gen $$1) {
      }

      @Override
      public void a(eqc $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(epv var1, gen var2);

   void a(eqc var1);
}
