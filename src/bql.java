public class bql extends cdh {
   private static final aja<Integer> cb = aje.a(bql.class, ajc.b);

   public bql(bqg<? extends bql> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected kl r() {
      return kn.aN;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
   }

   @Override
   protected aun u() {
      return auo.kE;
   }

   @Override
   protected aun v() {
      return auo.kB;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.kD;
   }

   @Override
   protected aun o_() {
      return auo.kC;
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(to $$0) {
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

      this.dM().a(kn.aO, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.a(cb, $$0);
   }

   public int y() {
      return this.an.a(cb);
   }

   public static boolean a(bqg<? extends bqt> $$0, czv $$1, bqx $$2, id $$3, axt $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dcj.G);
   }
}
