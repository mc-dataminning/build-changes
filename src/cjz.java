public class cjz extends cjt {
   public cjz(bol<?> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cjz(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.ap, $$0, $$1, $$2, $$3);
   }

   @Override
   public bml a(cia $$0, bmk $$1) {
      if ($$0.fK()) {
         return bml.d;
      } else if (this.bM()) {
         return bml.d;
      } else if (!this.dJ().B) {
         return $$0.m(this) ? bml.b : bml.d;
      } else {
         return bml.a;
      }
   }

   @Override
   protected cpl ai_() {
      return cpt.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bM()) {
            this.bB();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bq();
         }
      }
   }

   @Override
   public cjt.a w() {
      return cjt.a.a;
   }
}
