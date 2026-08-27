public abstract class bxy extends blu {
   protected bxy(bkz<? extends bxy> $$0, csf $$1) {
      super($$0, $$1);
      this.a(edi.j, 0.0F);
   }

   @Override
   public blq eT() {
      return blq.e;
   }

   @Override
   public boolean a(csi $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ef() {
      return 1 + this.dN().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dO().h(), 2.0F);
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
   public boolean a(cdz $$0) {
      return false;
   }

   public static boolean c(bkz<? extends bxy> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(arp.a) && $$1.a_($$3.c()).a(cvh.G);
   }
}
