public class dae extends czv {
   public final dae.a b;

   public dae(czv.b $$0, dae.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, bri $$1) {
      if ($$1.a(awn.e)) {
         return 0;
      } else if (this.b == dae.a.a) {
         return $$0;
      } else if (this.b == dae.a.b && $$1.a(awn.j)) {
         return $$0 * 2;
      } else if (this.b == dae.a.c && $$1.a(awn.n)) {
         return $$0 * 3;
      } else if (this.b == dae.a.d && $$1.a(awn.m)) {
         return $$0 * 2;
      } else {
         return this.b == dae.a.e && $$1.a(awn.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(czv $$0) {
      if ($$0 instanceof dae $$1) {
         return this.b == $$1.b ? false : this.b == dae.a.c || $$1.b == dae.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(btk $$0, int $$1) {
      int $$2 = czw.a(czy.b, $$0);
      if ($$2 > 0) {
         $$1 -= ayu.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(btk $$0, double $$1) {
      int $$2 = czw.a(czy.d, $$0);
      if ($$2 > 0) {
         $$1 *= ayu.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
