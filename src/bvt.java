public abstract class bvt extends bjp {
   protected bvt(biu<? extends bvt> $$0, cpv $$1) {
      super($$0, $$1);
      this.a(eax.j, 0.0F);
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   public bjl eR() {
      return bjl.e;
   }

   @Override
   public boolean a(cpy $$0) {
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
      if (this.bw() && !this.bb()) {
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
   public void ar() {
      int $$0 = this.ci();
      super.ar();
      this.b($$0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public boolean a(cbu $$0) {
      return false;
   }

   public static boolean c(biu<? extends bvt> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      int $$5 = $$1.y_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(apy.a) && $$1.a_($$3.c()).a(csw.G);
   }
}
