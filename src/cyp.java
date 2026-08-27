public class cyp extends cyg {
   public final cyp.a b;

   public cyp(cyg.b $$0, cyp.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, bqf $$1) {
      if ($$1.a(avt.e)) {
         return 0;
      } else if (this.b == cyp.a.a) {
         return $$0;
      } else if (this.b == cyp.a.b && $$1.a(avt.j)) {
         return $$0 * 2;
      } else if (this.b == cyp.a.c && $$1.a(avt.n)) {
         return $$0 * 3;
      } else if (this.b == cyp.a.d && $$1.a(avt.m)) {
         return $$0 * 2;
      } else {
         return this.b == cyp.a.e && $$1.a(avt.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cyg $$0) {
      if ($$0 instanceof cyp $$1) {
         return this.b == $$1.b ? false : this.b == cyp.a.c || $$1.b == cyp.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bsa $$0, int $$1) {
      int $$2 = cyh.a(cyj.b, $$0);
      if ($$2 > 0) {
         $$1 -= axz.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bsa $$0, double $$1) {
      int $$2 = cyh.a(cyj.d, $$0);
      if ($$2 > 0) {
         $$1 *= axz.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
