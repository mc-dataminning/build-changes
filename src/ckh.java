public abstract class ckh extends bxr {
   public static final int d = 120;

   protected ckh(bwr<? extends ckh> $$0, djm $$1) {
      super($$0, $$1);
      this.a(exr.j, 0.0F);
   }

   @Override
   public boolean a(djp $$0) {
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
      if (this.bI() && !this.bh()) {
         this.j($$1 - 1);
         if (this.cr() == -20) {
            this.j(0);
            this.a($$0, this.dV().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cr();
      super.aw();
      if (this.dU() instanceof arq $$1) {
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

   public static boolean c(bwr<? extends ckh> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmt.J);
   }
}
