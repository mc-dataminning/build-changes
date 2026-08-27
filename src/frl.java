import com.mojang.blaze3d.systems.RenderSystem;

public interface frl {
   frl a = new frl() {
      @Override
      public void a(eqf $$0, gfc $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gfa.e);
         $$0.a(eqp.b.h, eqi.l);
      }

      @Override
      public void a(eqm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   frl b = new frl() {
      @Override
      public void a(eqf $$0, gfc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(ftm::u);
         RenderSystem.setShaderTexture(0, gfa.f);
         $$0.a(eqp.b.h, eqi.l);
      }

      @Override
      public void a(eqm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   frl c = new frl() {
      @Override
      public void a(eqf $$0, gfc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gfa.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eqp.b.h, eqi.l);
      }

      @Override
      public void a(eqm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   frl d = new frl() {
      @Override
      public void a(eqf $$0, gfc $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gfa.f);
         $$0.a(eqp.b.h, eqi.l);
      }

      @Override
      public void a(eqm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   frl e = new frl() {
      @Override
      public void a(eqf $$0, gfc $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eqm $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   frl f = new frl() {
      @Override
      public void a(eqf $$0, gfc $$1) {
      }

      @Override
      public void a(eqm $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(eqf var1, gfc var2);

   void a(eqm var1);
}
