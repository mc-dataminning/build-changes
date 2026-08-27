public class biq extends bvj {
   private static final adz<Integer> bX = aec.a(biq.class, aeb.b);

   public biq(bim<? extends biq> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected it p() {
      return iv.aJ;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
   }

   @Override
   protected aov q() {
      return aow.jC;
   }

   @Override
   protected aov r() {
      return aow.jz;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.jB;
   }

   @Override
   protected aov h_() {
      return aow.jA;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.t());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.c($$0.h("DarkTicksRemaining"));
   }

   @Override
   public void b_() {
      super.b_();
      int $$0 = this.t();
      if ($$0 > 0) {
         this.c($$0 - 1);
      }

      this.dK().a(iv.aK, this.d(0.6), this.ds(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2) {
         this.c(100);
      }

      return $$2;
   }

   private void c(int $$0) {
      this.an.b(bX, $$0);
   }

   public int t() {
      return this.an.b(bX);
   }

   public static boolean a(bim<? extends biy> $$0, cqb $$1, bjc $$2, gu $$3, aru $$4) {
      return $$3.v() <= $$1.t_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(csn.G);
   }
}
