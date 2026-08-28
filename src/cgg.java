public abstract class cgg extends btw {
   protected cgg(bsx<? extends cgg> $$0, dcw $$1) {
      super($$0, $$1);
      this.a(epv.j, 0.0F);
   }

   @Override
   public boolean a(dcz $$0) {
      return $$0.f(this);
   }

   @Override
   public int R() {
      return 120;
   }

   @Override
   protected int eg() {
      return 1 + this.dO().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bE() && !this.bi()) {
         this.j($$0 - 1);
         if (this.cm() == -20) {
            this.j(0);
            this.a(this.dP().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cm();
      super.aw();
      this.b($$0);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   public boolean y() {
      return false;
   }

   public static boolean c(bsx<? extends cgg> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.e()).a(awk.a) && $$1.a_($$3.d()).a(dga.G);
   }
}
