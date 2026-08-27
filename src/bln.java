public class bln extends byh {
   private static final afz<Integer> bX = agc.a(bln.class, agb.b);

   public bln(blj<? extends bln> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected jt u() {
      return jv.aM;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
   }

   @Override
   protected arb w() {
      return arc.kf;
   }

   @Override
   protected arb y() {
      return arc.kc;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.ke;
   }

   @Override
   protected arb n_() {
      return arc.kd;
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.A());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void d_() {
      super.d_();
      int $$0 = this.A();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dM().a(jv.aN, this.d(0.6), this.du(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bX, $$0);
   }

   public int A() {
      return this.an.b(bX);
   }

   public static boolean a(blj<? extends blv> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      return $$3.v() <= $$1.A_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(cwb.G);
   }
}
