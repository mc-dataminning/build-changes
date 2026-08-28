public class ckx extends clt {
   public ckx(btv<? extends ckx> $$0, deg $$1) {
      super($$0, $$1);
   }

   public static boolean a(btv<ckx> $$0, dew $$1, btu $$2, je $$3, azl $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (btu.a($$2) || $$1.h($$3));
   }

   @Override
   protected boolean ag_() {
      return false;
   }

   @Override
   protected awd w() {
      return awe.na;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.nd;
   }

   @Override
   protected awd n_() {
      return awe.nc;
   }

   @Override
   protected awd y() {
      return awe.ne;
   }

   @Override
   public boolean E(bto $$0) {
      boolean $$1 = super.E($$0);
      if ($$1 && this.eW().f() && $$0 instanceof buk) {
         float $$2 = this.dS().d_(this.ds()).b();
         ((buk)$$0).b(new bsv(bsx.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gq() {
      return true;
   }

   @Override
   protected void af_() {
      this.b(btv.bu);
      if (!this.ba()) {
         this.dS().a(null, 1041, this.ds(), 0);
      }
   }

   @Override
   protected cvp gp() {
      return cvp.k;
   }
}
