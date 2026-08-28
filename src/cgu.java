public abstract class cgu extends btz {
   protected cgu(bup<? extends cgu> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.j, 0.0F);
   }

   @Override
   public boolean a(dfi $$0) {
      return $$0.f(this);
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   public int er() {
      return 1 + this.dY().A.a(3);
   }

   protected void s(int $$0) {
      if (this.bN() && !this.bo()) {
         this.j($$0 - 1);
         if (this.cv() == -20) {
            this.j(0);
            this.a(this.dZ().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aB() {
      int $$0 = this.cv();
      super.aB();
      this.s($$0);
   }

   @Override
   public boolean cL() {
      return false;
   }

   @Override
   public boolean A() {
      return false;
   }

   public static boolean b(bup<? extends cgu> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      int $$5 = $$1.N();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axj.a) && $$1.a_($$3.d()).a(dil.G);
   }
}
