public abstract class cav extends boo {
   protected cav(bnu<? extends cav> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.j, 0.0F);
   }

   @Override
   public boolean a(cvq $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ef() {
      return 1 + this.dM().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
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
   public boolean a(chh $$0) {
      return false;
   }

   public static boolean c(bnu<? extends cav> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(aue.a) && $$1.a_($$3.c()).a(cyq.G);
   }
}
