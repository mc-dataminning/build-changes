public abstract class cho extends buq {
   protected cho(bvi<? extends cho> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.j, 0.0F);
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   public int e(ard $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bJ() && !this.bj()) {
         this.j($$0 - 1);
         if (this.cs() == -20) {
            this.j(0);
            this.a(this.dV().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void az() {
      int $$0 = this.cs();
      super.az();
      this.r($$0);
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   public boolean w() {
      return false;
   }

   public static boolean b(bvi<? extends cho> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(awv.a) && $$1.a_($$3.d()).a(dkg.J);
   }
}
