public class chg extends cha {
   public chg(blz<?> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public chg(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.ao, $$0, $$1, $$2, $$3);
   }

   @Override
   public bkb a(cfi $$0, bka $$1) {
      if ($$0.fI()) {
         return bkb.d;
      } else if (this.bP()) {
         return bkb.d;
      } else if (!this.dM().B) {
         return $$0.n(this) ? bkb.b : bkb.d;
      } else {
         return bkb.a;
      }
   }

   @Override
   protected cmt ah_() {
      return cnb.nL;
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
   public cha.a w() {
      return cha.a.a;
   }
}
