public abstract class ciu extends bwg {
   public static final int d = 120;

   protected ciu(bvi<? extends ciu> $$0, dgz $$1) {
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
   protected int e(ard $$0) {
      return 1 + this.ae.a(3);
   }

   protected void a(ard $$0, int $$1) {
      if (this.bJ() && !this.bj()) {
         this.j($$1 - 1);
         if (this.cs() == -20) {
            this.j(0);
            this.a($$0, this.dV().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void az() {
      int $$0 = this.cs();
      super.az();
      if (this.dU() instanceof ard $$1) {
         this.a($$1, $$0);
      }
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   public boolean w() {
      return false;
   }

   public static boolean c(bvi<? extends ciu> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(awv.a) && $$1.a_($$3.d()).a(dkg.J);
   }
}
