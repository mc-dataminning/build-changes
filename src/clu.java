public class clu extends cmq {
   public clu(bur<? extends clu> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public static boolean a(bur<clu> $$0, dgy $$1, buq $$2, ji $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (buq.a($$2) || $$1.h($$3));
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
   protected avz e(bta $$0) {
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
   public boolean c(ard $$0, buk $$1) {
      boolean $$2 = super.c($$0, $$1);
      if ($$2 && this.eZ().f() && $$1 instanceof bvg) {
         float $$3 = this.dV().d_(this.dv()).b();
         ((bvg)$$1).b(new btp(btr.q, 140 * (int)$$3), this);
      }

      return $$2;
   }

   @Override
   protected boolean gt() {
      return true;
   }

   @Override
   protected void ah_() {
      this.b(bur.bN);
      if (!this.bb()) {
         this.dV().a(null, 1041, this.dv(), 0);
      }
   }

   @Override
   protected cwo gs() {
      return cwo.j;
   }
}
