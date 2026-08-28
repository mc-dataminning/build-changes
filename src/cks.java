public class cks extends clo {
   public cks(btq<? extends cks> $$0, dds $$1) {
      super($$0, $$1);
   }

   public static boolean a(btq<cks> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btp.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ag_() {
      return false;
   }

   @Override
   protected awc w() {
      return awd.na;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.nd;
   }

   @Override
   protected awc n_() {
      return awd.nc;
   }

   @Override
   protected awc y() {
      return awd.ne;
   }

   @Override
   public boolean E(btj $$0) {
      boolean $$1 = super.E($$0);
      if ($$1 && this.eW().f() && $$0 instanceof buf) {
         float $$2 = this.dS().d_(this.ds()).b();
         ((buf)$$0).b(new bsq(bss.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void af_() {
      this.b(btq.bu);
      if (!this.ba()) {
         this.dS().a(null, 1041, this.ds(), 0);
      }
   }

   @Override
   protected cvl go() {
      return cvl.k;
   }
}
