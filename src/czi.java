public class czi extends cyz {
   public final czi.a b;

   public czi(cyz.b $$0, czi.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, bqn $$1) {
      if ($$1.a(avy.e)) {
         return 0;
      } else if (this.b == czi.a.a) {
         return $$0;
      } else if (this.b == czi.a.b && $$1.a(avy.j)) {
         return $$0 * 2;
      } else if (this.b == czi.a.c && $$1.a(avy.n)) {
         return $$0 * 3;
      } else if (this.b == czi.a.d && $$1.a(avy.m)) {
         return $$0 * 2;
      } else {
         return this.b == czi.a.e && $$1.a(avy.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cyz $$0) {
      if ($$0 instanceof czi $$1) {
         return this.b == $$1.b ? false : this.b == czi.a.c || $$1.b == czi.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bso $$0, int $$1) {
      int $$2 = cza.a(czc.b, $$0);
      if ($$2 > 0) {
         $$1 -= ayd.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bso $$0, double $$1) {
      int $$2 = cza.a(czc.d, $$0);
      if ($$2 > 0) {
         $$1 *= ayd.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
