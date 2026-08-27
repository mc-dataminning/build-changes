public abstract class bvz extends bjv {
   protected bvz(bja<? extends bvz> $$0, cqb $$1) {
      super($$0, $$1);
      this.a(ear.j, 0.0F);
   }

   @Override
   public bjr eR() {
      return bjr.e;
   }

   @Override
   public boolean a(cqe $$0) {
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
   public boolean a(cca $$0) {
      return false;
   }

   public static boolean c(bja<? extends bvz> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      int $$5 = $$1.y_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(aqa.a) && $$1.a_($$3.c()).a(cte.G);
   }
}
