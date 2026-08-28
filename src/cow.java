public class cow extends cps {
   public cow(bxc<? extends cow> $$0, djx $$1) {
      super($$0, $$1);
   }

   public static boolean a(bxc<cow> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bxb.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ah_() {
      return false;
   }

   @Override
   protected awo u() {
      return awp.nB;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.nE;
   }

   @Override
   protected awo l_() {
      return awp.nD;
   }

   @Override
   protected awo n() {
      return awp.nF;
   }

   @Override
   public boolean c(ars $$0, bwt $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.fb().f() && $$1 instanceof bxu) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bxu)$$1).b(new bvx(bvz.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean x() {
      return true;
   }

   @Override
   protected void ag_() {
      this.b(bxc.bP);
      if (!this.ba()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected czy t() {
      return czy.k;
   }
}
