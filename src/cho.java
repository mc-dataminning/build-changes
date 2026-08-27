public class cho extends chi {
   public cho(bmc<?> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cho(ctx $$0, double $$1, double $$2, double $$3) {
      super(bmc.ap, $$0, $$1, $$2, $$3);
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      if ($$0.fI()) {
         return bkc.d;
      } else if (this.bP()) {
         return bkc.d;
      } else if (!this.dL().B) {
         return $$0.m(this) ? bkc.b : bkc.d;
      } else {
         return bkc.a;
      }
   }

   @Override
   protected cnb ai_() {
      return cnj.nL;
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
   public chi.a w() {
      return chi.a.a;
   }
}
