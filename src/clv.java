public class clv extends cmr {
   public clv(bus<? extends clv> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public static boolean a(bus<clv> $$0, dgz $$1, bur $$2, ji $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bur.a($$2) || $$1.h($$3));
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
   protected avz e(btb $$0) {
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
   public boolean c(ard $$0, bul $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvh) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bvh)$$1).b(new btq(bts.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gt() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bus.bN);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cwp gs() {
      return cwp.j;
   }
}
