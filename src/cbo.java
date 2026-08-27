public abstract class cbo extends bpf {
   protected cbo(bol<? extends cbo> $$0, cwe $$1) {
      super($$0, $$1);
      this.a(eic.j, 0.0F);
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this);
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public int ed() {
      return 1 + this.dJ().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bx() && !this.bc()) {
         this.k($$0 - 1);
         if (this.cf() == -20) {
            this.k(0);
            this.a(this.dK().h(), 2.0F);
         }
      } else {
         this.k(300);
      }
   }

   @Override
   public void as() {
      int $$0 = this.cf();
      super.as();
      this.b($$0);
   }

   @Override
   public boolean cw() {
      return false;
   }

   @Override
   public boolean a(cia $$0) {
      return false;
   }

   public static boolean c(bol<? extends cbo> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      int $$5 = $$1.A_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(auj.a) && $$1.a_($$3.c()).a(czh.G);
   }
}
