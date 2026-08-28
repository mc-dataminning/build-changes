public class cij extends chz {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final ceb f = ceb.a().a(150.0);
   private final ceb g;
   private int h;

   public cij(chw $$0) {
      super($$0);
      this.g = ceb.a().a(20.0).a($$1 -> Math.abs($$1.dw() - $$0.dw()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      btk $$0 = this.a.dP().a(this.g, this.a, this.a.du(), this.a.dw(), this.a.dA());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gn().a(cim.h);
         } else {
            evm $$1 = new evm($$0.du() - this.a.du(), 0.0, $$0.dA() - this.a.dA()).d();
            evm $$2 = new evm((double)ayu.a(this.a.dF() * (float) (Math.PI / 180.0)), 0.0, (double)(-ayu.b(this.a.dF() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.du() - this.a.e.du();
               double $$6 = $$0.dA() - this.a.e.dA();
               double $$7 = ayu.a(ayu.d(180.0 - ayu.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dF()), -100.0, 100.0);
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
         this.a.gn().a(cim.e);
         if ($$0 != null) {
            this.a.gn().a(cim.i);
            this.a.gn().b(cim.i).a(new evm($$0.du(), $$0.dw(), $$0.dA()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public cim<cij> i() {
      return cim.g;
   }
}
