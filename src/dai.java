public class dai extends czz {
   public final dai.a b;

   public dai(czz.b $$0, dai.a $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public int a(int $$0, brm $$1) {
      if ($$1.a(awq.e)) {
         return 0;
      } else if (this.b == dai.a.a) {
         return $$0;
      } else if (this.b == dai.a.b && $$1.a(awq.j)) {
         return $$0 * 2;
      } else if (this.b == dai.a.c && $$1.a(awq.n)) {
         return $$0 * 3;
      } else if (this.b == dai.a.d && $$1.a(awq.m)) {
         return $$0 * 2;
      } else {
         return this.b == dai.a.e && $$1.a(awq.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(czz $$0) {
      if ($$0 instanceof dai $$1) {
         return this.b == $$1.b ? false : this.b == dai.a.c || $$1.b == dai.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bto $$0, int $$1) {
      int $$2 = daa.a(dac.b, $$0);
      if ($$2 > 0) {
         $$1 -= ayy.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bto $$0, double $$1) {
      int $$2 = daa.a(dac.d, $$0);
      if ($$2 > 0) {
         $$1 *= ayy.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
