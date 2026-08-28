public abstract class cld extends byn {
   public static final int d = 120;

   protected cld(bxn<? extends cld> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.j, 0.0F);
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   protected int e(asb $$0) {
      return 1 + this.ae.a(3);
   }

   protected void a(asb $$0, int $$1) {
      if (this.bJ() && !this.bi()) {
         this.j($$1 - 1);
         if (this.cs() == -20) {
            this.j(0);
            this.a($$0, this.dW().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cs();
      super.aw();
      if (this.dV() instanceof asb $$1) {
         this.a($$1, $$0);
      }
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public boolean w() {
      return false;
   }

   public static boolean c(bxn<? extends cld> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axs.a) && $$1.a_($$3.d()).a(dnq.J);
   }
}
