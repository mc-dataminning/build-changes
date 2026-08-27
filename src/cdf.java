public abstract class cdf extends bqw {
   protected cdf(bqb<? extends cdf> $$0, cyx $$1) {
      super($$0, $$1);
      this.a(elj.j, 0.0F);
   }

   @Override
   public boolean a(cza $$0) {
      return $$0.f(this);
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public int eg() {
      return 1 + this.dM().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bA() && !this.bf()) {
         this.k($$0 - 1);
         if (this.ci() == -20) {
            this.k(0);
            this.a(this.dN().h(), 2.0F);
         }
      } else {
         this.k(300);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      this.b($$0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public boolean a(cjt $$0) {
      return false;
   }

   public static boolean c(bqb<? extends cdf> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(avh.a) && $$1.a_($$3.c()).a(dca.G);
   }
}
