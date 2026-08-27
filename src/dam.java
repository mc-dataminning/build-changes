public class dam extends dad {
   public final dam.a b;

   public dam(dad.b $$0, dam.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, bqt $$1) {
      if ($$1.a(awg.e)) {
         return 0;
      } else if (this.b == dam.a.a) {
         return $$0;
      } else if (this.b == dam.a.b && $$1.a(awg.j)) {
         return $$0 * 2;
      } else if (this.b == dam.a.c && $$1.a(awg.n)) {
         return $$0 * 3;
      } else if (this.b == dam.a.d && $$1.a(awg.m)) {
         return $$0 * 2;
      } else {
         return this.b == dam.a.e && $$1.a(awg.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(dad $$0) {
      if ($$0 instanceof dam $$1) {
         return this.b == $$1.b ? false : this.b == dam.a.c || $$1.b == dam.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bso $$0, int $$1) {
      int $$2 = dae.a(dag.b, $$0);
      if ($$2 > 0) {
         $$1 -= aym.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bso $$0, double $$1) {
      int $$2 = dae.a(dag.d, $$0);
      if ($$2 > 0) {
         $$1 *= aym.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
