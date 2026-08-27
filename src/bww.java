public abstract class bww extends bks {
   protected bww(bjx<? extends bww> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.j, 0.0F);
   }

   @Override
   public bko eR() {
      return bko.e;
   }

   @Override
   public boolean a(crc $$0) {
      return $$0.f(this);
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public int ed() {
      return 1 + this.dL().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bv() && !this.ba()) {
         this.j($$0 - 1);
         if (this.ch() == -20) {
            this.j(0);
            this.a(this.dM().h(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aq() {
      int $$0 = this.ch();
      super.aq();
      this.b($$0);
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public boolean a(ccx $$0) {
      return false;
   }

   public static boolean c(bjx<? extends bww> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(aqx.a) && $$1.a_($$3.c()).a(cuc.G);
   }
}
