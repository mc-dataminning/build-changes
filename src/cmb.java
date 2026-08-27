public class cmb extends clv {
   public cmb(bqg<?> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cmb(czg $$0, double $$1, double $$2, double $$3) {
      super(bqg.aq, $$0, $$1, $$2, $$3);
   }

   @Override
   public bof a(cka $$0, boe $$1) {
      if ($$0.fO()) {
         return bof.d;
      } else if (this.bP()) {
         return bof.d;
      } else if (!this.dM().B) {
         return $$0.n(this) ? bof.b : bof.d;
      } else {
         return bof.a;
      }
   }

   @Override
   protected crn ag_() {
      return crv.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bE();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bt();
         }
      }
   }

   @Override
   public clv.a v() {
      return clv.a.a;
   }
}
