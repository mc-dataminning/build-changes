public class dak extends dab {
   public final dak.a b;

   public dak(dab.b $$0, dak.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, bro $$1) {
      if ($$1.a(awr.e)) {
         return 0;
      } else if (this.b == dak.a.a) {
         return $$0;
      } else if (this.b == dak.a.b && $$1.a(awr.j)) {
         return $$0 * 2;
      } else if (this.b == dak.a.c && $$1.a(awr.n)) {
         return $$0 * 3;
      } else if (this.b == dak.a.d && $$1.a(awr.m)) {
         return $$0 * 2;
      } else {
         return this.b == dak.a.e && $$1.a(awr.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(dab $$0) {
      if ($$0 instanceof dak $$1) {
         return this.b == $$1.b ? false : this.b == dak.a.c || $$1.b == dak.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(btq $$0, int $$1) {
      int $$2 = dac.a(dae.b, $$0);
      if ($$2 > 0) {
         $$1 -= ayz.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(btq $$0, double $$1) {
      int $$2 = dac.a(dae.d, $$0);
      if ($$2 > 0) {
         $$1 *= ayz.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
