public abstract class bvv extends bjr {
   protected bvv(biw<? extends bvv> $$0, cpx $$1) {
      super($$0, $$1);
      this.a(eaz.j, 0.0F);
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   public bjn eR() {
      return bjn.e;
   }

   @Override
   public boolean a(cqa $$0) {
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
   public boolean a(cbw $$0) {
      return false;
   }

   public static boolean c(biw<? extends bvv> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      int $$5 = $$1.y_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(apz.a) && $$1.a_($$3.c()).a(csy.G);
   }
}
