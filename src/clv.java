public class clv extends cmr {
   public clv(bus<? extends clv> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public static boolean a(bus<clv> $$0, dgd $$1, bur $$2, jh $$3, azu $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bur.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ai_() {
      return false;
   }

   @Override
   protected awm t() {
      return awn.mY;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.nb;
   }

   @Override
   protected awm n_() {
      return awn.na;
   }

   @Override
   protected awm v() {
      return awn.nc;
   }

   @Override
   public boolean c(arp $$0, bul $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eX().f() && $$1 instanceof bvh) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bvh)$$1).b(new btq(bts.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean go() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bus.bK);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cwm gn() {
      return cwm.k;
   }
}
