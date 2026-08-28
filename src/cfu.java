public abstract class cfu extends btc {
   protected cfu(btq<? extends cfu> $$0, dds $$1) {
      super($$0, $$1);
      this.a(eqs.j, 0.0F);
   }

   @Override
   public boolean a(ddv $$0) {
      return $$0.f(this);
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   public int ek() {
      return 1 + this.dS().z.a(3);
   }

   protected void s(int $$0) {
      if (this.bI() && !this.bl()) {
         this.j($$0 - 1);
         if (this.cq() == -20) {
            this.j(0);
            this.a(this.dT().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void ay() {
      int $$0 = this.cq();
      super.ay();
      this.s($$0);
   }

   @Override
   public boolean cG() {
      return false;
   }

   @Override
   public boolean A() {
      return false;
   }

   public static boolean b(btq<? extends cfu> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      int $$5 = $$1.N();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(awy.a) && $$1.a_($$3.d()).a(dgx.G);
   }
}
