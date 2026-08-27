import com.mojang.blaze3d.systems.RenderSystem;

public interface fqr {
   fqr a = new fqr() {
      @Override
      public void a(epo $$0, geg $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gee.e);
         $$0.a(epy.b.h, epr.l);
      }

      @Override
      public void a(epv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fqr b = new fqr() {
      @Override
      public void a(epo $$0, geg $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fss::u);
         RenderSystem.setShaderTexture(0, gee.f);
         $$0.a(epy.b.h, epr.l);
      }

      @Override
      public void a(epv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fqr c = new fqr() {
      @Override
      public void a(epo $$0, geg $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gee.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(epy.b.h, epr.l);
      }

      @Override
      public void a(epv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fqr d = new fqr() {
      @Override
      public void a(epo $$0, geg $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gee.f);
         $$0.a(epy.b.h, epr.l);
      }

      @Override
      public void a(epv $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fqr e = new fqr() {
      @Override
      public void a(epo $$0, geg $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(epv $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fqr f = new fqr() {
      @Override
      public void a(epo $$0, geg $$1) {
      }

      @Override
      public void a(epv $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(epo var1, geg var2);

   void a(epv var1);
}
