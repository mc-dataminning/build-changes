public class coh extends cnu {
   public final coh.a a;

   public coh(cnu.a $$0, coh.a $$1, bjb... $$2) {
      super($$0, $$1 == coh.a.c ? cnv.b : cnv.a, $$2);
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
   public int a(int $$0, bhu $$1) {
      if ($$1.a(apx.d)) {
         return 0;
      } else if (this.a == coh.a.a) {
         return $$0;
      } else if (this.a == coh.a.b && $$1.a(apx.i)) {
         return $$0 * 2;
      } else if (this.a == coh.a.c && $$1.a(apx.m)) {
         return $$0 * 3;
      } else if (this.a == coh.a.d && $$1.a(apx.l)) {
         return $$0 * 2;
      } else {
         return this.a == coh.a.e && $$1.a(apx.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cnu $$0) {
      if ($$0 instanceof coh $$1) {
         return this.a == $$1.a ? false : this.a == coh.a.c || $$1.a == coh.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bjm $$0, int $$1) {
      int $$2 = cnw.a(cny.b, $$0);
      if ($$2 > 0) {
         $$1 -= asb.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bjm $$0, double $$1) {
      int $$2 = cnw.a(cny.d, $$0);
      if ($$2 > 0) {
         $$1 *= asb.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
