public class crp extends crc {
   public final crp.a a;

   public crp(crc.a $$0, crp.a $$1, blu... $$2) {
      super($$0, $$1 == crp.a.c ? crd.b : crd.a, $$2);
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
   public int a(int $$0, bkn $$1) {
      if ($$1.a(asd.e)) {
         return 0;
      } else if (this.a == crp.a.a) {
         return $$0;
      } else if (this.a == crp.a.b && $$1.a(asd.j)) {
         return $$0 * 2;
      } else if (this.a == crp.a.c && $$1.a(asd.n)) {
         return $$0 * 3;
      } else if (this.a == crp.a.d && $$1.a(asd.m)) {
         return $$0 * 2;
      } else {
         return this.a == crp.a.e && $$1.a(asd.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(crc $$0) {
      if ($$0 instanceof crp $$1) {
         return this.a == $$1.a ? false : this.a == crp.a.c || $$1.a == crp.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bmf $$0, int $$1) {
      int $$2 = cre.a(crg.b, $$0);
      if ($$2 > 0) {
         $$1 -= aui.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bmf $$0, double $$1) {
      int $$2 = cre.a(crg.d, $$0);
      if ($$2 > 0) {
         $$1 *= aui.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
