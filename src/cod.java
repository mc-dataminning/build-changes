public class cod extends cnq {
   public final cod.a a;

   public cod(cnq.a $$0, cod.a $$1, bix... $$2) {
      super($$0, $$1 == cod.a.c ? cnr.b : cnr.a, $$2);
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
   public int a(int $$0, bhq $$1) {
      if ($$1.a(apw.d)) {
         return 0;
      } else if (this.a == cod.a.a) {
         return $$0;
      } else if (this.a == cod.a.b && $$1.a(apw.i)) {
         return $$0 * 2;
      } else if (this.a == cod.a.c && $$1.a(apw.m)) {
         return $$0 * 3;
      } else if (this.a == cod.a.d && $$1.a(apw.l)) {
         return $$0 * 2;
      } else {
         return this.a == cod.a.e && $$1.a(apw.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cnq $$0) {
      if ($$0 instanceof cod $$1) {
         return this.a == $$1.a ? false : this.a == cod.a.c || $$1.a == cod.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bji $$0, int $$1) {
      int $$2 = cns.a(cnu.b, $$0);
      if ($$2 > 0) {
         $$1 -= ary.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bji $$0, double $$1) {
      int $$2 = cns.a(cnu.d, $$0);
      if ($$2 > 0) {
         $$1 *= ary.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
