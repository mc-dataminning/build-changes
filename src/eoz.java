import com.mojang.blaze3d.systems.RenderSystem;

public abstract class eoz extends epf {
   protected static final int g = 46;
   protected static final int h = 200;
   protected static final int i = 20;
   protected static final int j = 20;
   protected static final int k = 4;
   protected static final int l = 2;

   public eoz(int $$0, int $$1, int $$2, int $$3, sw $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void c();

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      enn $$4 = enn.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.t);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(m, this.p(), this.r(), this.k(), this.h(), 20, 4, 200, 20, 0, this.a());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.r ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | apa.f(this.t * 255.0F) << 24);
   }

   public void a(eox $$0, eov $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   private int a() {
      int $$0 = 1;
      if (!this.r) {
         $$0 = 0;
      } else if (this.n()) {
         $$0 = 2;
      }

      return 46 + $$0 * 20;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.c();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.r || !this.s) {
         return false;
      } else if (esu.a($$0)) {
         this.a(enn.N().ah());
         this.c();
         return true;
      } else {
         return false;
      }
   }
}
