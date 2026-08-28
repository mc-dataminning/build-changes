public class cla extends clw {
   public cla(bty<? extends cla> $$0, dej $$1) {
      super($$0, $$1);
   }

   public static boolean a(bty<cla> $$0, dez $$1, btx $$2, jf $$3, azn $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btx.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ah_() {
      return false;
   }

   @Override
   protected awf w() {
      return awg.na;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.nd;
   }

   @Override
   protected awf o_() {
      return awg.nc;
   }

   @Override
   protected awf y() {
      return awg.ne;
   }

   @Override
   public boolean E(btr $$0) {
      boolean $$1 = super.E($$0);
      if ($$1 && this.eW().f() && $$0 instanceof bun) {
         float $$2 = this.dS().d_(this.ds()).b();
         ((bun)$$0).b(new bsy(bta.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ag_() {
      this.b(bty.bu);
      if (!this.ba()) {
         this.dS().a(null, 1041, this.ds(), 0);
      }
   }

   @Override
   protected cvs go() {
      return cvs.k;
   }
}
