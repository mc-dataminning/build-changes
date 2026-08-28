public abstract class cfu extends btl {
   protected cfu(bsn<? extends cfu> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.j, 0.0F);
   }

   @Override
   public boolean a(dcj $$0) {
      return $$0.f(this);
   }

   @Override
   public int P() {
      return 120;
   }

   @Override
   protected int ei() {
      return 1 + this.dR().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bF() && !this.bj()) {
         this.j($$0 - 1);
         if (this.cn() == -20) {
            this.j(0);
            this.a(this.dS().i(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cn();
      super.aw();
      this.b($$0);
   }

   @Override
   public boolean cE() {
      return false;
   }

   @Override
   public boolean a(cml $$0) {
      return false;
   }

   public static boolean c(bsn<? extends cfu> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awc.a) && $$1.a_($$3.c()).a(dfk.G);
   }
}
