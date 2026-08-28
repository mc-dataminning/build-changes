public abstract class ckd extends bxm {
   public static final int d = 120;

   protected ckd(bwo<? extends ckd> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.j, 0.0F);
   }

   @Override
   public boolean a(djd $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   protected int e(arq $$0) {
      return 1 + this.ae.a(3);
   }

   protected void a(arq $$0, int $$1) {
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
      if (this.dV() instanceof arq $$1) {
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

   public static boolean c(bwo<? extends ckd> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmh.J);
   }
}
