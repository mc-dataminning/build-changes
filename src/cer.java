public abstract class cer extends bsi {
   protected cer(brn<? extends cer> $$0, dad $$1) {
      super($$0, $$1);
      this.a(emr.j, 0.0F);
   }

   @Override
   public boolean a(dag $$0) {
      return $$0.f(this);
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public int eh() {
      return 1 + this.dN().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bB() && !this.bf()) {
         this.k($$0 - 1);
         if (this.cj() == -20) {
            this.k(0);
            this.a(this.dO().h(), 2.0F);
         }
      } else {
         this.k(300);
      }
   }

   @Override
   public void as() {
      int $$0 = this.cj();
      super.as();
      this.b($$0);
   }

   @Override
   public boolean cA() {
      return false;
   }

   @Override
   public boolean a(clh $$0) {
      return false;
   }

   public static boolean c(brn<? extends cer> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(avw.a) && $$1.a_($$3.c()).a(ddg.G);
   }
}
