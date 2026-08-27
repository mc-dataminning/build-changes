public class cfr extends cfl {
   public cfr(bku<?> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cfr(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      if ($$0.fJ()) {
         return bix.d;
      } else if (this.bP()) {
         return bix.d;
      } else if (!this.dN().B) {
         return $$0.n(this) ? bix.b : bix.d;
      } else {
         return bix.a;
      }
   }

   @Override
   protected cle ag_() {
      return clm.nL;
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
   public cfl.a w() {
      return cfl.a.a;
   }
}
