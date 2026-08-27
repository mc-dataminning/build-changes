import com.mojang.blaze3d.systems.RenderSystem;

public interface fos {
   fos a = new fos() {
      @Override
      public void a(enw $$0, gca $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gby.e);
         $$0.a(eog.b.h, enz.l);
      }

      @Override
      public void a(eod $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fos b = new fos() {
      @Override
      public void a(enw $$0, gca $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fqs::u);
         RenderSystem.setShaderTexture(0, gby.f);
         $$0.a(eog.b.h, enz.l);
      }

      @Override
      public void a(eod $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fos c = new fos() {
      @Override
      public void a(enw $$0, gca $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gby.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eog.b.h, enz.l);
      }

      @Override
      public void a(eod $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fos d = new fos() {
      @Override
      public void a(enw $$0, gca $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gby.f);
         $$0.a(eog.b.h, enz.l);
      }

      @Override
      public void a(eod $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fos e = new fos() {
      @Override
      public void a(enw $$0, gca $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eod $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fos f = new fos() {
      @Override
      public void a(enw $$0, gca $$1) {
      }

      @Override
      public void a(eod $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(enw var1, gca var2);

   void a(eod var1);
}
