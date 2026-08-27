public class bio extends bvh {
   private static final adx<Integer> bX = aea.a(bio.class, adz.b);

   public bio(bik<? extends bio> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected iu p() {
      return iw.aJ;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
   }

   @Override
   protected aot q() {
      return aou.jC;
   }

   @Override
   protected aot r() {
      return aou.jz;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.jB;
   }

   @Override
   protected aot h_() {
      return aou.jA;
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("DarkTicksRemaining", this.t());
   }

   @Override
   public void a(qs $$0) {
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

      this.dK().a(iw.aK, this.d(0.6), this.ds(), this.g(0.6), 0.0, 0.0, 0.0);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
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

   public static boolean a(bik<? extends biw> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      return $$3.v() <= $$1.t_() - 33 && $$1.b($$3, 0) == 0 && $$1.a_($$3).a(csl.G);
   }
}
