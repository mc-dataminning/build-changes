public abstract class cgc extends btt {
   protected cgc(bsv<? extends cgc> $$0, dbt $$1) {
      super($$0, $$1);
      this.a(eoh.j, 0.0F);
   }

   @Override
   public boolean a(dbw $$0) {
      return $$0.f(this);
   }

   @Override
   public int P() {
      return 120;
   }

   @Override
   public int ej() {
      return 1 + this.dP().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bD() && !this.bh()) {
         this.k($$0 - 1);
         if (this.cl() == -20) {
            this.k(0);
            this.a(this.dQ().h(), 2.0F);
         }
      } else {
         this.k(300);
      }
   }

   @Override
   public void au() {
      int $$0 = this.cl();
      super.au();
      this.b($$0);
   }

   @Override
   public boolean cC() {
      return false;
   }

   @Override
   public boolean a(cms $$0) {
      return false;
   }

   public static boolean c(bsv<? extends cgc> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awr.a) && $$1.a_($$3.c()).a(dew.G);
   }
}
