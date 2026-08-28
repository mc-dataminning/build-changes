public class csj extends csa {
   private final bsb m;
   private final int n;

   private csj(ctj<?> $$0, int $$1, cou $$2, int $$3) {
      this($$0, $$1, $$2, new bsp(9 * $$3), $$3);
   }

   public static csj a(int $$0, cou $$1) {
      return new csj(ctj.a, $$0, $$1, 1);
   }

   public static csj b(int $$0, cou $$1) {
      return new csj(ctj.b, $$0, $$1, 2);
   }

   public static csj c(int $$0, cou $$1) {
      return new csj(ctj.c, $$0, $$1, 3);
   }

   public static csj d(int $$0, cou $$1) {
      return new csj(ctj.d, $$0, $$1, 4);
   }

   public static csj e(int $$0, cou $$1) {
      return new csj(ctj.e, $$0, $$1, 5);
   }

   public static csj f(int $$0, cou $$1) {
      return new csj(ctj.f, $$0, $$1, 6);
   }

   public static csj a(int $$0, cou $$1, bsb $$2) {
      return new csj(ctj.c, $$0, $$1, $$2, 3);
   }

   public static csj b(int $$0, cou $$1, bsb $$2) {
      return new csj(ctj.f, $$0, $$1, $$2, 6);
   }

   public csj(ctj<?> $$0, int $$1, cou $$2, bsb $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.c_($$2.k);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(bsb $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ctx($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cov $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bsb l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
