public abstract class cft extends btk {
   protected cft(bsm<? extends cft> $$0, dcf $$1) {
      super($$0, $$1);
      this.a(eoy.j, 0.0F);
   }

   @Override
   public boolean a(dci $$0) {
      return $$0.f(this);
   }

   @Override
   public int P() {
      return 120;
   }

   @Override
   protected int eh() {
      return 1 + this.dQ().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bE() && !this.bi()) {
         this.j($$0 - 1);
         if (this.cm() == -20) {
            this.j(0);
            this.a(this.dR().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void av() {
      int $$0 = this.cm();
      super.av();
      this.b($$0);
   }

   @Override
   public boolean cD() {
      return false;
   }

   @Override
   public boolean a(cmk $$0) {
      return false;
   }

   public static boolean c(bsm<? extends cft> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awc.a) && $$1.a_($$3.c()).a(dfj.G);
   }
}
