import com.mojang.blaze3d.systems.RenderSystem;

public interface flf {
   flf a = new flf() {
      @Override
      public void a(elb $$0, fym $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyk.e);
         $$0.a(ell.b.h, ele.l);
      }

      @Override
      public void a(eli $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   flf b = new flf() {
      @Override
      public void a(elb $$0, fym $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fne::u);
         RenderSystem.setShaderTexture(0, fyk.f);
         $$0.a(ell.b.h, ele.l);
      }

      @Override
      public void a(eli $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   flf c = new flf() {
      @Override
      public void a(elb $$0, fym $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyk.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(ell.b.h, ele.l);
      }

      @Override
      public void a(eli $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   flf d = new flf() {
      @Override
      public void a(elb $$0, fym $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyk.f);
         $$0.a(ell.b.h, ele.l);
      }

      @Override
      public void a(eli $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   flf e = new flf() {
      @Override
      public void a(elb $$0, fym $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eli $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   flf f = new flf() {
      @Override
      public void a(elb $$0, fym $$1) {
      }

      @Override
      public void a(eli $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(elb var1, fym var2);

   void a(eli var1);
}
