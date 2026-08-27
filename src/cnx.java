public class cnx extends cnr {
   public cnx(bsa<?> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cnx(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bpu a(clw $$0, bpt $$1) {
      if ($$0.fR()) {
         return bpu.d;
      } else if (this.bS()) {
         return bpu.d;
      } else if (!this.dP().B) {
         return $$0.n(this) ? bpu.b : bpu.d;
      } else {
         return bpu.a;
      }
   }

   @Override
   protected ctj ag_() {
      return ctr.nM;
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
   public cnr.a v() {
      return cnr.a.a;
   }
}
