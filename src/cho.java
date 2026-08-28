public abstract class cho extends bvd {
   public static final int e = 120;

   protected cho(bug<? extends cho> $$0, dev $$1) {
      super($$0, $$1);
      this.a(erv.j, 0.0F);
   }

   @Override
   public boolean a(dey $$0) {
      return $$0.f(this);
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   protected int eq() {
      return 1 + this.dX().A.a(3);
   }

   protected void u(int $$0) {
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
   public void aA() {
      int $$0 = this.cu();
      super.aA();
      this.u($$0);
   }

   @Override
   public boolean cK() {
      return false;
   }

   @Override
   public boolean A() {
      return false;
   }

   public static boolean c(bug<? extends cho> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      int $$5 = $$1.N();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axf.a) && $$1.a_($$3.d()).a(dia.G);
   }
}
