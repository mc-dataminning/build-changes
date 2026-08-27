import com.mojang.blaze3d.systems.RenderSystem;

public interface fnz {
   fnz a = new fnz() {
      @Override
      public void a(enf $$0, gbi $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gbg.e);
         $$0.a(enp.b.h, eni.l);
      }

      @Override
      public void a(enm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fnz b = new fnz() {
      @Override
      public void a(enf $$0, gbi $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fqa::u);
         RenderSystem.setShaderTexture(0, gbg.f);
         $$0.a(enp.b.h, eni.l);
      }

      @Override
      public void a(enm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fnz c = new fnz() {
      @Override
      public void a(enf $$0, gbi $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gbg.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(enp.b.h, eni.l);
      }

      @Override
      public void a(enm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fnz d = new fnz() {
      @Override
      public void a(enf $$0, gbi $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, gbg.f);
         $$0.a(enp.b.h, eni.l);
      }

      @Override
      public void a(enm $$0) {
         $$0.c();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fnz e = new fnz() {
      @Override
      public void a(enf $$0, gbi $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(enm $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fnz f = new fnz() {
      @Override
      public void a(enf $$0, gbi $$1) {
      }

      @Override
      public void a(enm $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(enf var1, gbi var2);

   void a(enm var1);
}
