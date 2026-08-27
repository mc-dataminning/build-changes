public class cmm extends cmg {
   public cmm(bqr<?> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cmm(czu $$0, double $$1, double $$2, double $$3) {
      super(bqr.aq, $$0, $$1, $$2, $$3);
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      if ($$0.fP()) {
         return boq.d;
      } else if (this.bQ()) {
         return boq.d;
      } else if (!this.dN().B) {
         return $$0.n(this) ? boq.b : boq.d;
      } else {
         return boq.a;
      }
   }

   @Override
   protected cry ag_() {
      return csg.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bQ()) {
            this.bF();
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
   public cmg.a v() {
      return cmg.a.a;
   }
}
