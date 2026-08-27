public class bxp extends bxf {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final btn f = btn.a().a(150.0);
   private final btn g;
   private int h;

   public bxp(bxc $$0) {
      super($$0);
      this.g = btn.a().a(20.0).a($$1 -> Math.abs($$1.dr() - $$0.dr()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bjb $$0 = this.a.dK().a(this.g, this.a, this.a.dp(), this.a.dr(), this.a.dv());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.fX().a(bxs.h);
         } else {
            ehi $$1 = new ehi($$0.dp() - this.a.dp(), 0.0, $$0.dv() - this.a.dv()).d();
            ehi $$2 = new ehi((double)ars.a(this.a.dA() * (float) (Math.PI / 180.0)), 0.0, (double)(-ars.b(this.a.dA() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dp() - this.a.e.dp();
               double $$6 = $$0.dv() - this.a.e.dv();
               double $$7 = ars.a(ars.d(180.0 - ars.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dA()), -100.0, 100.0);
               this.a.bW *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.bW += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dA() + this.a.bW);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dK().a(f, this.a, this.a.dp(), this.a.dr(), this.a.dv());
         this.a.fX().a(bxs.e);
         if ($$0 != null) {
            this.a.fX().a(bxs.i);
            this.a.fX().b(bxs.i).a(new ehi($$0.dp(), $$0.dr(), $$0.dv()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public bxs<bxp> i() {
      return bxs.g;
   }
}
