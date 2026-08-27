public abstract class byu extends bmo {
   protected byu(blt<? extends byu> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.j, 0.0F);
   }

   @Override
   public bmk eS() {
      return bmk.e;
   }

   @Override
   public boolean a(ctl $$0) {
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
   public boolean a(cfb $$0) {
      return false;
   }

   public static boolean c(blt<? extends byu> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(asg.a) && $$1.a_($$3.c()).a(cwl.G);
   }
}
