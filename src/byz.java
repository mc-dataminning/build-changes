public abstract class byz extends bmt {
   protected byz(bly<? extends byz> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.j, 0.0F);
   }

   @Override
   public bmp eS() {
      return bmp.e;
   }

   @Override
   public boolean a(ctr $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ee() {
      return 1 + this.dM().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dN().h(), 2.0F);
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
   public boolean a(cfh $$0) {
      return false;
   }

   public static boolean c(bly<? extends byz> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(asl.a) && $$1.a_($$3.c()).a(cwr.G);
   }
}
