public class cpz extends cpm {
   public final cpz.a a;

   public cpz(cpm.a $$0, cpz.a $$1, bkn... $$2) {
      super($$0, $$1 == cpz.a.c ? cpn.b : cpn.a, $$2);
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
   public int a(int $$0, bjg $$1) {
      if ($$1.a(are.d)) {
         return 0;
      } else if (this.a == cpz.a.a) {
         return $$0;
      } else if (this.a == cpz.a.b && $$1.a(are.i)) {
         return $$0 * 2;
      } else if (this.a == cpz.a.c && $$1.a(are.m)) {
         return $$0 * 3;
      } else if (this.a == cpz.a.d && $$1.a(are.l)) {
         return $$0 * 2;
      } else {
         return this.a == cpz.a.e && $$1.a(are.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cpm $$0) {
      if ($$0 instanceof cpz $$1) {
         return this.a == $$1.a ? false : this.a == cpz.a.c || $$1.a == cpz.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bky $$0, int $$1) {
      int $$2 = cpo.a(cpq.b, $$0);
      if ($$2 > 0) {
         $$1 -= ati.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bky $$0, double $$1) {
      int $$2 = cpo.a(cpq.d, $$0);
      if ($$2 > 0) {
         $$1 *= ati.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
