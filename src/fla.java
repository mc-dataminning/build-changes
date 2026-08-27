import com.mojang.blaze3d.systems.RenderSystem;

public interface fla {
   fla a = new fla() {
      @Override
      public void a(elc $$0, fyh $$1) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyf.e);
         $$0.a(elm.b.h, elf.l);
      }

      @Override
      public void a(elj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "TERRAIN_SHEET";
      }
   };
   fla b = new fla() {
      @Override
      public void a(elc $$0, fyh $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShader(fmz::u);
         RenderSystem.setShaderTexture(0, fyf.f);
         $$0.a(elm.b.h, elf.l);
      }

      @Override
      public void a(elj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_OPAQUE";
      }
   };
   fla c = new fla() {
      @Override
      public void a(elc $$0, fyh $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyf.f);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         $$0.a(elm.b.h, elf.l);
      }

      @Override
      public void a(elj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_TRANSLUCENT";
      }
   };
   fla d = new fla() {
      @Override
      public void a(elc $$0, fyh $$1) {
         RenderSystem.disableBlend();
         RenderSystem.depthMask(true);
         RenderSystem.setShaderTexture(0, fyf.f);
         $$0.a(elm.b.h, elf.l);
      }

      @Override
      public void a(elj $$0) {
         $$0.b();
      }

      @Override
      public String toString() {
         return "PARTICLE_SHEET_LIT";
      }
   };
   fla e = new fla() {
      @Override
      public void a(elc $$0, fyh $$1) {
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
      }

      @Override
      public void a(elj $$0) {
      }

      @Override
      public String toString() {
         return "CUSTOM";
      }
   };
   fla f = new fla() {
      @Override
      public void a(elc $$0, fyh $$1) {
      }

      @Override
      public void a(elj $$0) {
      }

      @Override
      public String toString() {
         return "NO_RENDER";
      }
   };

   void a(elc var1, fyh var2);

   void a(elj var1);
}
