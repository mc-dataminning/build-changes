import com.mojang.blaze3d.systems.RenderSystem;

public interface fqa {
   fqa a = new fqa() {
      @Override
      public void a(eoy $$0, gdp $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gdn.e);
         $$0.a(epi.b.h, epb.l);
      }

      @Override
      public void a(epf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fqa b = new fqa() {
      @Override
      public void a(eoy $$0, gdp $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fsb::u);
         RenderSystem.setShaderTexture(0, gdn.f);
         $$0.a(epi.b.h, epb.l);
      }

      @Override
      public void a(epf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fqa c = new fqa() {
      @Override
      public void a(eoy $$0, gdp $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gdn.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(epi.b.h, epb.l);
      }

      @Override
      public void a(epf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fqa d = new fqa() {
      @Override
      public void a(eoy $$0, gdp $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gdn.f);
         $$0.a(epi.b.h, epb.l);
      }

      @Override
      public void a(epf $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fqa e = new fqa() {
      @Override
      public void a(eoy $$0, gdp $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(epf $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fqa f = new fqa() {
      @Override
      public void a(eoy $$0, gdp $$1) {
      }

      @Override
      public void a(epf $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(eoy var1, gdp var2);

   void a(epf var1);
}
