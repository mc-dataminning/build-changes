public class cgz extends cgt {
   public cgz(blt<?> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cgz(cti $$0, double $$1, double $$2, double $$3) {
      super(blt.ao, $$0, $$1, $$2, $$3);
   }

   @Override
   public bjv a(cfb $$0, bju $$1) {
      if ($$0.fI()) {
         return bjv.d;
      } else if (this.bP()) {
         return bjv.d;
      } else if (!this.dM().B) {
         return $$0.n(this) ? bjv.b : bjv.d;
      } else {
         return bjv.a;
      }
   }

   @Override
   protected cmm ah_() {
      return cmu.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bB();
         }

         if (this.O() == 0) {
            this.m(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bq();
         }
      }
   }

   @Override
   public cgt.a w() {
      return cgt.a.a;
   }
}
