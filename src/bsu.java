public class bsu extends cfr {
   private static final ajp<Integer> ce = ajt.a(bsu.class, ajr.b);

   public bsu(bsn<? extends bsu> $$0, dcg $$1) {
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
   protected avg t() {
      return avh.kJ;
   }

   @Override
   protected avg v() {
      return avh.kG;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.kI;
   }

   @Override
   protected avg n_() {
      return avh.kH;
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.x());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void m_() {
      super.m_();
      int $$0 = this.x();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dR().a(lj.aQ, this.d(0.6), this.dz(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.ao.a(ce, $$0);
   }

   public int x() {
      return this.ao.a(ce);
   }

   public static boolean a(bsn<? extends btc> $$0, dcv $$1, btg $$2, ja $$3, ayo $$4) {
      return $$3.v() <= $$1.z_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(dfk.G);
   }
}
