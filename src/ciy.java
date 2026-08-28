public abstract class ciy extends bvy {
   protected ciy(bwr<? extends ciy> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.j, 0.0F);
   }

   @Override
   public boolean a(djk $$0) {
      return $$0.f(this);
   }

   @Override
   public int S() {
      return 120;
   }

   @Override
   public int e(arq $$0) {
      return 1 + this.ae.a(3);
   }

   protected void r(int $$0) {
      if (this.bI() && !this.bh()) {
         this.j($$0 - 1);
         if (this.cr() == -20) {
            this.j(0);
            this.a(this.dV().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cr();
      super.aw();
      this.r($$0);
   }

   @Override
   public boolean cI() {
      return false;
   }

   @Override
   public boolean w() {
      return false;
   }

   public static boolean b(bwr<? extends ciy> $$0, dji $$1, bwq $$2, iv $$3, azv $$4) {
      int $$5 = $$1.P();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(axh.a) && $$1.a_($$3.d()).a(dmo.J);
   }
}
