import com.mojang.blaze3d.systems.RenderSystem;

public interface flt {
   flt a = new flt() {
      @Override
      public void a(elf $$0, fza $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyy.e);
         $$0.a(elp.b.h, eli.l);
      }

      @Override
      public void a(elm $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   flt b = new flt() {
      @Override
      public void a(elf $$0, fza $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fns::u);
         RenderSystem.setShaderTexture(0, fyy.f);
         $$0.a(elp.b.h, eli.l);
      }

      @Override
      public void a(elm $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   flt c = new flt() {
      @Override
      public void a(elf $$0, fza $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyy.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(elp.b.h, eli.l);
      }

      @Override
      public void a(elm $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   flt d = new flt() {
      @Override
      public void a(elf $$0, fza $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyy.f);
         $$0.a(elp.b.h, eli.l);
      }

      @Override
      public void a(elm $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   flt e = new flt() {
      @Override
      public void a(elf $$0, fza $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(elm $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   flt f = new flt() {
      @Override
      public void a(elf $$0, fza $$1) {
      }

      @Override
      public void a(elm $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(elf var1, fza var2);

   void a(elm var1);
}
