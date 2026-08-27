public abstract class caz extends boq {
   protected caz(bnw<? extends caz> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.j, 0.0F);
   }

   @Override
   public boolean a(cvu $$0) {
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
   public boolean a(chl $$0) {
      return false;
   }

   public static boolean c(bnw<? extends caz> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(auf.a) && $$1.a_($$3.c()).a(cyu.G);
   }
}
