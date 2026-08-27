public class cfj extends cfd {
   public cfj(bkm<?> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cfj(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public biq a(cdm $$0, bip $$1) {
      if ($$0.fI()) {
         return biq.d;
      } else if (this.bO()) {
         return biq.d;
      } else if (!this.dL().B) {
         return $$0.n(this) ? biq.b : biq.d;
      } else {
         return biq.a;
      }
   }

   @Override
   protected ckw ag_() {
      return cle.na;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bO()) {
            this.bA();
         }

         if (this.N() == 0) {
            this.m(-this.O());
            this.d(10);
            this.b(50.0F);
            this.bo();
         }
      }
   }

   @Override
   public cfd.a v() {
      return cfd.a.a;
   }
}
