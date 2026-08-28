public abstract class cjt extends bxh {
   public static final int d = 120;

   protected cjt(bwj<? extends cjt> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.j, 0.0F);
   }

   @Override
   public boolean a(dis $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   protected int e(aro $$0) {
      return 1 + this.ae.a(3);
   }

   protected void a(aro $$0, int $$1) {
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
      if (this.dV() instanceof aro $$1) {
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

   public static boolean c(bwj<? extends cjt> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axf.a) && $$1.a_($$3.d()).a(dlw.J);
   }
}
