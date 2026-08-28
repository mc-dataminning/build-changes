public class bst extends cfq {
   private static final ajp<Integer> ce = ajt.a(bst.class, ajr.b);

   public bst(bsm<? extends bst> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Override
   protected lh s() {
      return lj.aP;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
   }

   @Override
   protected avg u() {
      return avh.kJ;
   }

   @Override
   protected avg v() {
      return avh.kG;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.kI;
   }

   @Override
   protected avg o_() {
      return avh.kH;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void n_() {
      super.n_();
      int $$0 = this.y();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dQ().a(lj.aQ, this.d(0.6), this.dy(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(ce, $$0);
   }

   public int y() {
      return this.ao.a(ce);
   }

   public static boolean a(bsm<? extends btb> $$0, dcu $$1, btf $$2, ja $$3, ayo $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfj.G);
   }
}
