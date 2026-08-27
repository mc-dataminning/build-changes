import com.mojang.blaze3d.systems.RenderSystem;

public abstract class etb extends eth {
   protected static final int e = 2;
   private static final euw a = new euw(new afw("widget/button"), new afw("widget/button_disabled"), new afw("widget/button_highlighted"));

   public etb(int $$0, int $$1, int $$2, int $$3, ui $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void c();

   @Override
   protected void b(esy $$0, int $$1, int $$2, float $$3) {
      ero $$4 = ero.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.n()), this.p(), this.r(), this.k(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | asy.f(this.k * 255.0F) << 24);
   }

   public void a(esy $$0, esw $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.c();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.i || !this.j) {
         return false;
      } else if (exh.a($$0)) {
         this.a(ero.O().ai());
         this.c();
         return true;
      } else {
         return false;
      }
   }
}
