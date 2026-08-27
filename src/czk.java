public class czk extends czb {
   public final czk.a b;

   public czk(czb.b $$0, czk.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, bqp $$1) {
      if ($$1.a(avz.e)) {
         return 0;
      } else if (this.b == czk.a.a) {
         return $$0;
      } else if (this.b == czk.a.b && $$1.a(avz.j)) {
         return $$0 * 2;
      } else if (this.b == czk.a.c && $$1.a(avz.n)) {
         return $$0 * 3;
      } else if (this.b == czk.a.d && $$1.a(avz.m)) {
         return $$0 * 2;
      } else {
         return this.b == czk.a.e && $$1.a(avz.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(czb $$0) {
      if ($$0 instanceof czk $$1) {
         return this.b == $$1.b ? false : this.b == czk.a.c || $$1.b == czk.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bsq $$0, int $$1) {
      int $$2 = czc.a(cze.b, $$0);
      if ($$2 > 0) {
         $$1 -= ayf.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bsq $$0, double $$1) {
      int $$2 = czc.a(cze.d, $$0);
      if ($$2 > 0) {
         $$1 *= ayf.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
