public abstract class cjl extends bwz {
   public static final int d = 120;

   protected cjl(bwb<? extends cjl> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.j, 0.0F);
   }

   @Override
   public boolean a(dhs $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   protected int e(arn $$0) {
      return 1 + this.ae.a(3);
   }

   protected void a(arn $$0, int $$1) {
      if (this.bK() && !this.bj()) {
         this.j($$1 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a($$0, this.dW().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void az() {
      int $$0 = this.ct();
      super.az();
      if (this.dV() instanceof arn $$1) {
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

   public static boolean c(bwb<? extends cjl> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axf.a) && $$1.a_($$3.d()).a(dkw.J);
   }
}
