public class cpa extends cou {
   public cpa(btb<?> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cpa(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bqv a(cmy $$0, bqu $$1) {
      if ($$0.fR()) {
         return bqv.e;
      } else if (this.bS()) {
         return bqv.e;
      } else if (!this.dP().B) {
         return $$0.n(this) ? bqv.c : bqv.e;
      } else {
         return bqv.a;
      }
   }

   @Override
   protected cul ag_() {
      return cut.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bS()) {
            this.bH();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bv();
         }
      }
   }

   @Override
   public cou.a v() {
      return cou.a.a;
   }
}
