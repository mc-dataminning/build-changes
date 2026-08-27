public class bzm extends bzc {
   private static final int b = 100;
   private static final int c = 10;
   private static final int d = 20;
   private static final int e = 150;
   private static final bvk f = bvk.a().a(150.0);
   private final bvk g;
   private int h;

   public bzm(byz $$0) {
      super($$0);
      this.g = bvk.a().a(20.0).a($$1 -> Math.abs($$1.ds() - $$0.ds()) <= 10.0);
   }

   @Override
   public void c() {
      this.h++;
      bky $$0 = this.a.dL().a(this.g, this.a, this.a.dq(), this.a.ds(), this.a.dw());
      if ($$0 != null) {
         if (this.h > 25) {
            this.a.gb().a(bzp.h);
         } else {
            eji $$1 = new eji($$0.dq() - this.a.dq(), 0.0, $$0.dw() - this.a.dw()).d();
            eji $$2 = new eji((double)ati.a(this.a.dB() * (float) (Math.PI / 180.0)), 0.0, (double)(-ati.b(this.a.dB() * (float) (Math.PI / 180.0)))).d();
            float $$3 = (float)$$2.b($$1);
            float $$4 = (float)(Math.acos((double)$$3) * 180.0F / (float)Math.PI) + 0.5F;
            if ($$4 < 0.0F || $$4 > 10.0F) {
               double $$5 = $$0.dq() - this.a.e.dq();
               double $$6 = $$0.dw() - this.a.e.dw();
               double $$7 = ati.a(ati.d(180.0 - ati.d($$5, $$6) * 180.0F / (float)Math.PI - (double)this.a.dB()), -100.0, 100.0);
               this.a.bW *= 0.8F;
               float $$8 = (float)Math.sqrt($$5 * $$5 + $$6 * $$6) + 1.0F;
               float $$9 = $$8;
               if ($$8 > 40.0F) {
                  $$8 = 40.0F;
               }

               this.a.bW += (float)$$7 * (0.7F / $$8 / $$9);
               this.a.r(this.a.dB() + this.a.bW);
            }
         }
      } else if (this.h >= 100) {
         $$0 = this.a.dL().a(f, this.a, this.a.dq(), this.a.ds(), this.a.dw());
         this.a.gb().a(bzp.e);
         if ($$0 != null) {
            this.a.gb().a(bzp.i);
            this.a.gb().b(bzp.i).a(new eji($$0.dq(), $$0.ds(), $$0.dw()));
         }
      }
   }

   @Override
   public void d() {
      this.h = 0;
   }

   @Override
   public bzp<bzm> i() {
      return bzp.g;
   }
}
