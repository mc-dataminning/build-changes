public abstract class chf extends buv {
   public static final int e = 120;

   protected chf(bty<? extends chf> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.j, 0.0F);
   }

   @Override
   public boolean a(dem $$0) {
      return $$0.f(this);
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   protected int el() {
      return 1 + this.dS().z.a(3);
   }

   protected void u(int $$0) {
      if (this.bI() && !this.bl()) {
         this.j($$0 - 1);
         if (this.cq() == -20) {
            this.j(0);
            this.a(this.dT().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void ay() {
      int $$0 = this.cq();
      super.ay();
      this.u($$0);
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   public boolean A() {
      return false;
   }

   public static boolean c(bty<? extends chf> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      int $$5 = $$1.N();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axb.a) && $$1.a_($$3.d()).a(dho.G);
   }
}
