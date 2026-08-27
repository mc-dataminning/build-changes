public class cpg extends cot {
   public final cpg.a a;

   public cpg(cot.a $$0, cpg.a $$1, bjy... $$2) {
      super($$0, $$1 == cpg.a.c ? cou.b : cou.a, $$2);
      this.a = $$1;
   }

   @Override
   public int a(int $$0) {
      return this.a.a() + ($$0 - 1) * this.a.b();
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.a.b();
   }

   @Override
   public int a() {
      return 4;
   }

   @Override
   public int a(int $$0, bir $$1) {
      if ($$1.a(aqu.d)) {
         return 0;
      } else if (this.a == cpg.a.a) {
         return $$0;
      } else if (this.a == cpg.a.b && $$1.a(aqu.i)) {
         return $$0 * 2;
      } else if (this.a == cpg.a.c && $$1.a(aqu.m)) {
         return $$0 * 3;
      } else if (this.a == cpg.a.d && $$1.a(aqu.l)) {
         return $$0 * 2;
      } else {
         return this.a == cpg.a.e && $$1.a(aqu.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cot $$0) {
      if ($$0 instanceof cpg $$1) {
         return this.a == $$1.a ? false : this.a == cpg.a.c || $$1.a == cpg.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bkj $$0, int $$1) {
      int $$2 = cov.a(cox.b, $$0);
      if ($$2 > 0) {
         $$1 -= asy.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bkj $$0, double $$1) {
      int $$2 = cov.a(cox.d, $$0);
      if ($$2 > 0) {
         $$1 *= asy.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
      }

      return $$1;
   }

   public static enum a {
      a(1, 11),
      b(10, 8),
      c(5, 6),
      d(5, 8),
      e(3, 6);

      private final int f;
      private final int g;

      private a(int $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.f;
      }

      public int b() {
         return this.g;
      }
   }
}
