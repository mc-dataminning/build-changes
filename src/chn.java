public class chn extends chd {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final cdf f = cdf.a().a(150.0);
   private final cdf g;
   private int h;

   public chn(cha $$0) {
      super($$0);
      this.g = cdf.a().a(20.0).a($$1 -> Math.abs($$1.dw() - $$0.dw()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bso $$0 = this.a.dP().a(this.g, this.a, this.a.du(), this.a.dw(), this.a.dA());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gm().a(chq.h);
         } else {
            euk $$1 = new euk($$0.du() - this.a.du(), 0.0, $$0.dA() - this.a.dA()).d();
            euk $$2 = new euk((double)ayd.a(this.a.dF() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayd.b(this.a.dF() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.du() - this.a.e.du();
               double $$6 = $$0.dA() - this.a.e.dA();
               double $$7 = ayd.a(ayd.d(180.0 - ayd.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dF()), -100.0, 100.0);
               this.a.cb *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.cb += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dF() + this.a.cb);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dP().a(f, this.a, this.a.du(), this.a.dw(), this.a.dA());
         this.a.gm().a(chq.e);
         if ($$0 != null) {
            this.a.gm().a(chq.i);
            this.a.gm().b(chq.i).a(new euk($$0.du(), $$0.dw(), $$0.dA()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public chq<chn> i() {
      return chq.g;
   }
}
