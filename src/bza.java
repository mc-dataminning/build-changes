public abstract class bza extends bmu {
   protected bza(blz<? extends bza> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.j, 0.0F);
   }

   @Override
   public bmq eS() {
      return bmq.e;
   }

   @Override
   public boolean a(cts $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ee() {
      return 1 + this.dM().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dN().h(), 2.0F);
         }
      } else {
         this.j(300);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      this.b($$0);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public boolean a(cfi $$0) {
      return false;
   }

   public static boolean c(blz<? extends bza> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(asm.a) && $$1.a_($$3.c()).a(cws.G);
   }
}
