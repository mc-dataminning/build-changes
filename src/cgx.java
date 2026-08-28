public abstract class cgx extends buc {
   protected cgx(bus<? extends cgx> $$0, dfm $$1) {
      super($$0, $$1);
      this.a(esm.j, 0.0F);
   }

   @Override
   public boolean a(dfp $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int e(arp $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bL() && !this.bm()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dW().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void az() {
      int $$0 = this.ct();
      super.az();
      this.r($$0);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   @Override
   public boolean y() {
      return false;
   }

   public static boolean b(bus<? extends cgx> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      int $$5 = $$1.O();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axi.a) && $$1.a_($$3.d()).a(dis.G);
   }
}
