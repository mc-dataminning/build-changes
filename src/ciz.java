public class ciz extends cjx {
   public ciz(bsb<? extends ciz> $$0, dca $$1) {
      super($$0, $$1);
   }

   public static boolean a(bsb<ciz> $$0, dcp $$1, bss $$2, ir $$3, ayt $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (bss.a($$2) || $$1.h($$3));
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected boolean ae_() {
      return false;
   }

   @Override
   protected avn u() {
      return avo.np;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.ns;
   }

   @Override
   protected avn n_() {
      return avo.nr;
   }

   @Override
   protected avn gy() {
      return avo.nt;
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.fg().d() && $$0 instanceof bso) {
         float $$2 = this.dU().d_(this.du()).b();
         ((bso)$$0).b(new brh(brj.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gA() {
      return true;
   }

   @Override
   protected void ad_() {
      this.b(bsb.by);
      if (!this.ba()) {
         this.dU().a(null, 1041, this.du(), 0);
      }
   }

   @Override
   protected cuh gz() {
      return cuh.i;
   }
}
