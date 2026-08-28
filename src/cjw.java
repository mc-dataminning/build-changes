public class cjw extends cjm {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cfm f = cfm.a().a(150.0);
   private final cfm g;
   private int h;

   public cjw(cjj $$0) {
      super($$0);
      this.g = cfm.a().a(20.0).a($$1 -> Math.abs($$1.dE() - $$0.dE()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      buv $$0 = this.a.dX().a(this.g, this.a, this.a.dC(), this.a.dE(), this.a.dI());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gs().a(cjz.h);
         } else {
            ezh $$1 = new ezh($$0.dC() - this.a.dC(), 0.0, $$0.dI() - this.a.dI()).d();
            ezh $$2 = new ezh((double)azj.a(this.a.dN() * (float) (Math.PI / 180.0)), 0.0, (double)(-azj.b(this.a.dN() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dC() - this.a.d.dC();
               double $$6 = $$0.dI() - this.a.d.dI();
               double $$7 = azj.a(azj.d(180.0 - azj.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dN()), -100.0, 100.0);
               this.a.ca *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.ca += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.v(this.a.dN() + this.a.ca);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dX().a(f, this.a, this.a.dC(), this.a.dE(), this.a.dI());
         this.a.gs().a(cjz.e);
         if ($$0 != null) {
            this.a.gs().a(cjz.i);
            this.a.gs().b(cjz.i).a(new ezh($$0.dC(), $$0.dE(), $$0.dI()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cjz<cjw> i() {
      return cjz.g;
   }
}
