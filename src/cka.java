public class cka extends ckw {
   public cka(bsx<? extends cka> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsx<cka> $$0, ddl $$1, btr $$2, jd $$3, ayw $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btr.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ah_() {
      return false;
   }

   @Override
   protected avo v() {
      return avp.mZ;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.nc;
   }

   @Override
   protected avo n_() {
      return avp.nb;
   }

   @Override
   protected avo gl() {
      return avp.nd;
   }

   @Override
   public boolean D(bsr $$0) {
      boolean $$1 = super.D($$0);
      if ($$1 && this.eU().e() && $$0 instanceof btn) {
         float $$2 = this.dP().d_(this.dp()).b();
         ((btn)$$0).b(new brz(bsb.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gn() {
      return true;
   }

   @Override
   protected void ag_() {
      this.b(bsx.bu);
      if (!this.aX()) {
         this.dP().a(null, 1041, this.dp(), 0);
      }
   }

   @Override
   protected cuq gm() {
      return cuq.l;
   }
}
