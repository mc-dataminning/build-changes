public abstract class cdk extends brb {
   protected cdk(bqg<? extends cdk> $$0, czg $$1) {
      super($$0, $$1);
      this.a(els.j, 0.0F);
   }

   @Override
   public boolean a(czj $$0) {
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
   public boolean a(cka $$0) {
      return false;
   }

   public static boolean c(bqg<? extends cdk> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(avj.a) && $$1.a_($$3.c()).a(dcj.G);
   }
}
