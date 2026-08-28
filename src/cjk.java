public class cjk extends ckg {
   public cjk(bsj<? extends cjk> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsj<cjk> $$0, dcs $$1, btc $$2, ja $$3, aym $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btc.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected ave v() {
      return avf.mZ;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.nc;
   }

   @Override
   protected ave o_() {
      return avf.nb;
   }

   @Override
   protected ave gn() {
      return avf.nd;
   }

   @Override
   public boolean D(bsd $$0) {
      boolean $$1 = super.D($$0);
      if ($$1 && this.eT().e() && $$0 instanceof bsy) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((bsy)$$0).b(new brl(brn.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bsj.bu);
      if (!this.aW()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cua go() {
      return cua.l;
   }
}
