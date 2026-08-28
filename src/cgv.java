public abstract class cgv extends bua {
   protected cgv(buq<? extends cgv> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.j, 0.0F);
   }

   @Override
   public boolean a(dgj $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int e(arc $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bL() && !this.bm()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dX().i(), 2.0F);
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

   public static boolean b(buq<? extends cgv> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(awu.a) && $$1.a_($$3.d()).a(djm.J);
   }
}
