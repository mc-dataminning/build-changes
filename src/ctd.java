public class ctd extends crj {
   private static final int m = 27;
   private final brr n;

   public ctd(int $$0, cog $$1) {
      this($$0, $$1, new bsf(27));
   }

   public ctd(int $$0, cog $$1, brr $$2) {
      super(css.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.d_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cte($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coh $$0) {
      return this.n.a($$0);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
