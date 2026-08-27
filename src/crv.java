public class crv extends cri {
   public final crv.a a;

   public crv(cri.a $$0, crv.a $$1, blz... $$2) {
      super($$0, $$1 == crv.a.c ? crj.b : crj.a, $$2);
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
   public int a(int $$0, bks $$1) {
      if ($$1.a(asi.e)) {
         return 0;
      } else if (this.a == crv.a.a) {
         return $$0;
      } else if (this.a == crv.a.b && $$1.a(asi.j)) {
         return $$0 * 2;
      } else if (this.a == crv.a.c && $$1.a(asi.n)) {
         return $$0 * 3;
      } else if (this.a == crv.a.d && $$1.a(asi.m)) {
         return $$0 * 2;
      } else {
         return this.a == crv.a.e && $$1.a(asi.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cri $$0) {
      if ($$0 instanceof crv $$1) {
         return this.a == $$1.a ? false : this.a == crv.a.c || $$1.a == crv.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bmk $$0, int $$1) {
      int $$2 = crk.a(crm.b, $$0);
      if ($$2 > 0) {
         $$1 -= aun.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bmk $$0, double $$1) {
      int $$2 = crk.a(crm.d, $$0);
      if ($$2 > 0) {
         $$1 *= aun.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
