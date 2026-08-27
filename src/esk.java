import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esk extends esq {
   protected static final int e = 2;
   private static final eue a = new eue(new aey("widget/button"), new aey("widget/button_disabled"), new aey("widget/button_highlighted"));

   public esk(int $$0, int $$1, int $$2, int $$3, tn $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void c();

   @Override
   protected void b(esh $$0, int $$1, int $$2, float $$3) {
      eqx $$4 = eqx.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.o()), this.r(), this.t(), this.l(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ary.f(this.k * 255.0F) << 24);
   }

   public void a(esh $$0, esf $$1, int $$2) {
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
      } else if (ewp.a($$0)) {
         this.a(eqx.O().ai());
         this.c();
         return true;
      } else {
         return false;
      }
   }
}
