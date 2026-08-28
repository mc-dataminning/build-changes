public class crs extends crj {
   private final brr m;
   private final int n;

   private crs(css<?> $$0, int $$1, cog $$2, int $$3) {
      this($$0, $$1, $$2, new bsf(9 * $$3), $$3);
   }

   public static crs a(int $$0, cog $$1) {
      return new crs(css.a, $$0, $$1, 1);
   }

   public static crs b(int $$0, cog $$1) {
      return new crs(css.b, $$0, $$1, 2);
   }

   public static crs c(int $$0, cog $$1) {
      return new crs(css.c, $$0, $$1, 3);
   }

   public static crs d(int $$0, cog $$1) {
      return new crs(css.d, $$0, $$1, 4);
   }

   public static crs e(int $$0, cog $$1) {
      return new crs(css.e, $$0, $$1, 5);
   }

   public static crs f(int $$0, cog $$1) {
      return new crs(css.f, $$0, $$1, 6);
   }

   public static crs a(int $$0, cog $$1, brr $$2) {
      return new crs(css.c, $$0, $$1, $$2, 3);
   }

   public static crs b(int $$0, cog $$1, brr $$2) {
      return new crs(css.f, $$0, $$1, $$2, 6);
   }

   public crs(css<?> $$0, int $$1, cog $$2, brr $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.d_($$2.k);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(brr $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ctg($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(coh $$0) {
      return this.m.a($$0);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
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
      this.m.c($$0);
   }

   public brr l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
