public abstract class cfq extends bth {
   protected cfq(bsj<? extends cfq> $$0, dcd $$1) {
      super($$0, $$1);
      this.a(eos.j, 0.0F);
   }

   @Override
   public boolean a(dcg $$0) {
      return $$0.f(this);
   }

   @Override
   public int P() {
      return 120;
   }

   @Override
   protected int eg() {
      return 1 + this.dP().z.a(3);
   }

   protected void b(int $$0) {
      if (this.bD() && !this.bh()) {
         this.j($$0 - 1);
         if (this.cl() == -20) {
            this.j(0);
            this.a(this.dQ().i(), 2.0F);
         }
      } else {
         this.j(300);
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
   public boolean a(cmh $$0) {
      return false;
   }

   public static boolean c(bsj<? extends cfq> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      int $$5 = $$1.z_();
      int $$6 = $$5 - 13;
      return $$3.v() >= $$6 && $$3.v() <= $$5 && $$1.b_($$3.d()).a(awa.a) && $$1.a_($$3.c()).a(dfh.G);
   }
}
