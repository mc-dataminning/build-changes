public class cul extends ctz {
   public final cul.a b;

   public cul(ctz.a $$0, cul.a $$1, bom... $$2) {
      super($$0, $$1 == cul.a.c ? aum.bb : aum.bf, $$2);
      this.b = $$1;
   }

   @Override
   public int a(int $$0) {
      return this.b.a() + ($$0 - 1) * this.b.b();
   }

   @Override
   public int b(int $$0) {
      return this.a($$0) + this.b.b();
   }

   @Override
   public int a() {
      return 4;
   }

   @Override
   public int a(int $$0, bne $$1) {
      if ($$1.a(aug.e)) {
         return 0;
      } else if (this.b == cul.a.a) {
         return $$0;
      } else if (this.b == cul.a.b && $$1.a(aug.j)) {
         return $$0 * 2;
      } else if (this.b == cul.a.c && $$1.a(aug.n)) {
         return $$0 * 3;
      } else if (this.b == cul.a.d && $$1.a(aug.m)) {
         return $$0 * 2;
      } else {
         return this.b == cul.a.e && $$1.a(aug.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(ctz $$0) {
      if ($$0 instanceof cul $$1) {
         return this.b == $$1.b ? false : this.b == cul.a.c || $$1.b == cul.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(box $$0, int $$1) {
      int $$2 = cua.a(cuc.b, $$0);
      if ($$2 > 0) {
         $$1 -= awm.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(box $$0, double $$1) {
      int $$2 = cua.a(cuc.d, $$0);
      if ($$2 > 0) {
         $$1 *= awm.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
