public class clw extends cms {
   public clw(but<? extends clw> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public static boolean a(but<clw> $$0, dha $$1, bus $$2, ji $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bus.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected avz u() {
      return awa.nx;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.nA;
   }

   @Override
   protected avz o_() {
      return awa.nz;
   }

   @Override
   protected avz t() {
      return awa.nB;
   }

   @Override
   public boolean c(ard $$0, bum $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvi) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bvi)$$1).b(new btr(btt.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gt() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(but.bN);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cwq gs() {
      return cwq.j;
   }
}
