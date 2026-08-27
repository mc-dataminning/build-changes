public abstract class bze extends bmx {
   protected bze(bmc<? extends bze> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.j, 0.0F);
   }

   @Override
   public bmt eS() {
      return bmt.e;
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ee() {
      return 1 + this.dL().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dM().h(), 2.0F);
         }
      } else {
         this.j(300);
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
   public boolean a(cfq $$0) {
      return false;
   }

   public static boolean c(bmc<? extends bze> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(asn.a) && $$1.a_($$3.c()).a(cxa.G);
   }
}
