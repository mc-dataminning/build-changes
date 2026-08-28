public abstract class cgq extends btv {
   protected cgq(bul<? extends cgq> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.j, 0.0F);
   }

   @Override
   public boolean a(dfe $$0) {
      return $$0.f(this);
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   public int eq() {
      return 1 + this.dX().A.a(3);
   }

   protected void s(int $$0) {
      if (this.bM() && !this.bn()) {
         this.j($$0 - 1);
         if (this.cu() == -20) {
            this.j(0);
            this.a(this.dY().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aB() {
      int $$0 = this.cu();
      super.aB();
      this.s($$0);
   }

   @Override
   public boolean cK() {
      return false;
   }

   @Override
   public boolean A() {
      return false;
   }

   public static boolean b(bul<? extends cgq> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      int $$5 = $$1.N();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axg.a) && $$1.a_($$3.d()).a(dig.G);
   }
}
