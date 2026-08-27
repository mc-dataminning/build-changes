public class cfx extends cgt {
   public cfx(bpd<? extends cfx> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public static boolean a(bpd<cfx> $$0, cxq $$1, bpt $$2, ib $$3, axd $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bpt.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected atx v() {
      return aty.mI;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.mL;
   }

   @Override
   protected atx n_() {
      return aty.mK;
   }

   @Override
   protected atx gn() {
      return aty.mM;
   }

   @Override
   public boolean C(box $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eU().b() && $$0 instanceof bpp) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((bpp)$$0).b(new bok(bom.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gp() {
      return true;
   }

   @Override
   protected void ac_() {
      this.b(bpd.bu);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cqm go() {
      return cqm.h;
   }
}
