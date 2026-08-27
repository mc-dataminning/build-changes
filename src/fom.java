import com.mojang.blaze3d.systems.RenderSystem;

public interface fom {
   fom a = new fom() {
      @Override
      public void a(enr $$0, gbv $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gbt.e);
         $$0.a(eob.b.h, enu.l);
      }

      @Override
      public void a(eny $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fom b = new fom() {
      @Override
      public void a(enr $$0, gbv $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fqn::u);
         RenderSystem.setShaderTexture(0, gbt.f);
         $$0.a(eob.b.h, enu.l);
      }

      @Override
      public void a(eny $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fom c = new fom() {
      @Override
      public void a(enr $$0, gbv $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gbt.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eob.b.h, enu.l);
      }

      @Override
      public void a(eny $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fom d = new fom() {
      @Override
      public void a(enr $$0, gbv $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gbt.f);
         $$0.a(eob.b.h, enu.l);
      }

      @Override
      public void a(eny $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fom e = new fom() {
      @Override
      public void a(enr $$0, gbv $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eny $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fom f = new fom() {
      @Override
      public void a(enr $$0, gbv $$1) {
      }

      @Override
      public void a(eny $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(enr var1, gbv var2);

   void a(eny var1);
}
