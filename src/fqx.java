import com.mojang.blaze3d.systems.RenderSystem;

public interface fqx {
   fqx a = new fqx() {
      @Override
      public void a(epu $$0, gem $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gek.e);
         $$0.a(eqe.b.h, epx.l);
      }

      @Override
      public void a(eqb $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fqx b = new fqx() {
      @Override
      public void a(epu $$0, gem $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fsy::u);
         RenderSystem.setShaderTexture(0, gek.f);
         $$0.a(eqe.b.h, epx.l);
      }

      @Override
      public void a(eqb $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fqx c = new fqx() {
      @Override
      public void a(epu $$0, gem $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gek.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(eqe.b.h, epx.l);
      }

      @Override
      public void a(eqb $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fqx d = new fqx() {
      @Override
      public void a(epu $$0, gem $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gek.f);
         $$0.a(eqe.b.h, epx.l);
      }

      @Override
      public void a(eqb $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fqx e = new fqx() {
      @Override
      public void a(epu $$0, gem $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(eqb $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fqx f = new fqx() {
      @Override
      public void a(epu $$0, gem $$1) {
      }

      @Override
      public void a(eqb $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(epu var1, gem var2);

   void a(eqb var1);
}
