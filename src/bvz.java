public class bvz extends bwv {
   public bvz(bfn<? extends bvz> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public static boolean a(bfn<bvz> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == bgd.c || $$1.g($$3));
   }

   @Override
   protected boolean X_() {
      return false;
   }

   @Override
   protected amg s() {
      return amh.lx;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.lA;
   }

   @Override
   protected amg g_() {
      return amh.lz;
   }

   @Override
   protected amg w() {
      return amh.lB;
   }

   @Override
   public boolean z(bfj $$0) {
      boolean $$1 = super.z($$0);
      if ($$1 && this.eO().b() && $$0 instanceof bfz) {
         float $$2 = this.dI().d_(this.di()).b();
         ((bfz)$$0).b(new bfa(bfc.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean fZ() {
      return true;
   }

   @Override
   protected void gb() {
      this.b(bfn.bp);
      if (!this.aQ()) {
         this.dI().a(null, 1041, this.di(), 0);
      }
   }

   @Override
   protected cfz fY() {
      return cfz.b;
   }
}
