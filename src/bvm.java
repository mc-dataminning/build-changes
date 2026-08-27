public abstract class bvm extends bjh {
   protected bvm(bim<? extends bvm> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.j, 0.0F);
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   public bjd eQ() {
      return bjd.e;
   }

   @Override
   public boolean a(cpp $$0) {
      return $$0.f(this);
   }

   @Override
   public int L() {
      return 120;
   }

   @Override
   public int ec() {
      return 1 + this.dK().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bv() && !this.ba()) {
         this.j($$0 - 1);
         if (this.ch() == -20) {
            this.j(0);
            this.a(this.dL().h(), 2.0F);
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
   public boolean a(cbn $$0) {
      return false;
   }

   public static boolean c(bim<? extends bvm> $$0, cpn $$1, bjc $$2, gu $$3, aru $$4) {
      int $$5 = $$1.t_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(apq.a) && $$1.a_($$3.c()).a(csn.G);
   }
}
