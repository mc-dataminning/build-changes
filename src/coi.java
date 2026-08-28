public class coi extends coc {
   public coi(bsj<?> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public coi(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bqd a(cmh $$0, bqc $$1) {
      if ($$0.fN()) {
         return bqd.e;
      } else if (this.bS()) {
         return bqd.e;
      } else if (!this.dP().B) {
         return $$0.n(this) ? bqd.c : bqd.e;
      } else {
         return bqd.a;
      }
   }

   @Override
   protected ctv ag_() {
      return cud.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bS()) {
            this.bH();
         }

         if (this.O() == 0) {
            this.m(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bv();
         }
      }
   }

   @Override
   public coc.a v() {
      return coc.a.a;
   }
}
