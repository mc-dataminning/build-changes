public class bqg extends cdc {
   private static final aiy<Integer> cb = ajc.a(bqg.class, aja.b);

   public bqg(bqb<? extends bqg> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected kj r() {
      return kl.aN;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
   }

   @Override
   protected aul u() {
      return aum.kE;
   }

   @Override
   protected aul v() {
      return aum.kB;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.kD;
   }

   @Override
   protected aul o_() {
      return aum.kC;
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.y());
   }

   @Override
   public void a(tm $$0) {
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

      this.dM().a(kl.aO, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
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

   public static boolean a(bqb<? extends bqo> $$0, czm $$1, bqs $$2, ib $$3, axr $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dca.G);
   }
}
