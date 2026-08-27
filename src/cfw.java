public class cfw extends cfq {
   public cfw(bkz<?> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cfw(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bjb a(cdz $$0, bja $$1) {
      if ($$0.fJ()) {
         return bjb.d;
      } else if (this.bP()) {
         return bjb.d;
      } else if (!this.dN().B) {
         return $$0.n(this) ? bjb.b : bjb.d;
      } else {
         return bjb.a;
      }
   }

   @Override
   protected clj ah_() {
      return clr.nL;
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
   public cfq.a w() {
      return cfq.a.a;
   }
}
