public class cni extends cnc {
   public cni(brn<?> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cni(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.aq, $$0, $$1, $$2, $$3);
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      if ($$0.fP()) {
         return bpm.d;
      } else if (this.bQ()) {
         return bpm.d;
      } else if (!this.dN().B) {
         return $$0.n(this) ? bpm.b : bpm.d;
      } else {
         return bpm.a;
      }
   }

   @Override
   protected csu ag_() {
      return ctc.nM;
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
   public cnc.a v() {
      return cnc.a.a;
   }
}
