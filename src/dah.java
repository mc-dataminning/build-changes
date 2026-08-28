public class dah extends czy {
   public final dah.a b;

   public dah(czy.b $$0, dah.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, brl $$1) {
      if ($$1.a(awq.e)) {
         return 0;
      } else if (this.b == dah.a.a) {
         return $$0;
      } else if (this.b == dah.a.b && $$1.a(awq.j)) {
         return $$0 * 2;
      } else if (this.b == dah.a.c && $$1.a(awq.n)) {
         return $$0 * 3;
      } else if (this.b == dah.a.d && $$1.a(awq.m)) {
         return $$0 * 2;
      } else {
         return this.b == dah.a.e && $$1.a(awq.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(czy $$0) {
      if ($$0 instanceof dah $$1) {
         return this.b == $$1.b ? false : this.b == dah.a.c || $$1.b == dah.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(btn $$0, int $$1) {
      int $$2 = czz.a(dab.b, $$0);
      if ($$2 > 0) {
         $$1 -= ayx.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(btn $$0, double $$1) {
      int $$2 = czz.a(dab.d, $$0);
      if ($$2 > 0) {
         $$1 *= ayx.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
      }

      return $$1;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
