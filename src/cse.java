public class cse extends crj {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final brr r;

   public cse(int $$0, cog $$1) {
      this($$0, $$1, new bsf(9));
   }

   public cse(int $$0, cog $$1, brr $$2) {
      super(css.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.d_($$1.k);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(brr $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new ctg($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(coh $$0) {
      return this.r.a($$0);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
