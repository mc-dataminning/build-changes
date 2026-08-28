public class ckb extends ckx {
   public ckb(btb<? extends ckb> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public static boolean a(btb<ckb> $$0, dco $$1, btu $$2, iz $$3, azh $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btu.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected avz v() {
      return awa.mZ;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.nc;
   }

   @Override
   protected avz o_() {
      return awa.nb;
   }

   @Override
   protected avz gq() {
      return awa.nd;
   }

   @Override
   public boolean C(bsv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eX().e() && $$0 instanceof btq) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((btq)$$0).b(new bsd(bsf.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gs() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(btb.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cuq gr() {
      return cuq.l;
   }
}
