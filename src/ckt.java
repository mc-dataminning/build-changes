public class ckt extends ckg {
   public final ckt.a a;

   public ckt(ckg.a $$0, ckt.a $$1, bfo... $$2) {
      super($$0, $$1 == ckt.a.c ? ckh.b : ckh.a, $$2);
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
   public int a(int $$0, ben $$1) {
      if ($$1.a(amy.d)) {
         return 0;
      } else if (this.a == ckt.a.a) {
         return $$0;
      } else if (this.a == ckt.a.b && $$1.a(amy.i)) {
         return $$0 * 2;
      } else if (this.a == ckt.a.c && $$1.a(amy.m)) {
         return $$0 * 3;
      } else if (this.a == ckt.a.d && $$1.a(amy.l)) {
         return $$0 * 2;
      } else {
         return this.a == ckt.a.e && $$1.a(amy.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(ckg $$0) {
      if ($$0 instanceof ckt $$1) {
         return this.a == $$1.a ? false : this.a == ckt.a.c || $$1.a == ckt.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bfz $$0, int $$1) {
      int $$2 = cki.a(ckk.b, $$0);
      if ($$2 > 0) {
         $$1 -= apa.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bfz $$0, double $$1) {
      int $$2 = cki.a(ckk.d, $$0);
      if ($$2 > 0) {
         $$1 *= apa.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
