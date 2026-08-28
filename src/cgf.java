public abstract class cgf extends btw {
   protected cgf(bsy<? extends cgf> $$0, dbw $$1) {
      super($$0, $$1);
      this.a(eok.j, 0.0F);
   }

   @Override
   public boolean a(dbz $$0) {
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
   public boolean a(cmv $$0) {
      return false;
   }

   public static boolean c(bsy<? extends cgf> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awu.a) && $$1.a_($$3.c()).a(dez.G);
   }
}
