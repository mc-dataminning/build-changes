import com.mojang.blaze3d.systems.RenderSystem;

public interface fqz {
   fqz a = new fqz() {
      @Override
      public void a(epw $$0, geo $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gem.e);
         $$0.a(eqg.b.h, epz.l);
      }

      @Override
      public void a(eqd $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fqz b = new fqz() {
      @Override
      public void a(epw $$0, geo $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fta::u);
         RenderSystem.setShaderTexture(0, gem.f);
         $$0.a(eqg.b.h, epz.l);
      }

      @Override
      public void a(eqd $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fqz c = new fqz() {
      @Override
      public void a(epw $$0, geo $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gem.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eqg.b.h, epz.l);
      }

      @Override
      public void a(eqd $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fqz d = new fqz() {
      @Override
      public void a(epw $$0, geo $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gem.f);
         $$0.a(eqg.b.h, epz.l);
      }

      @Override
      public void a(eqd $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fqz e = new fqz() {
      @Override
      public void a(epw $$0, geo $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eqd $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fqz f = new fqz() {
      @Override
      public void a(epw $$0, geo $$1) {
      }

      @Override
      public void a(eqd $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(epw var1, geo var2);

   void a(eqd var1);
}
