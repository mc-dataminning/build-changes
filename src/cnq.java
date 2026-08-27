public class cnq extends cnd {
   public final cnq.a a;

   public cnq(cnd.a $$0, cnq.a $$1, bil... $$2) {
      super($$0, $$1 == cnq.a.c ? cne.b : cne.a, $$2);
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
   public int a(int $$0, bhe $$1) {
      if ($$1.a(apl.d)) {
         return 0;
      } else if (this.a == cnq.a.a) {
         return $$0;
      } else if (this.a == cnq.a.b && $$1.a(apl.i)) {
         return $$0 * 2;
      } else if (this.a == cnq.a.c && $$1.a(apl.m)) {
         return $$0 * 3;
      } else if (this.a == cnq.a.d && $$1.a(apl.l)) {
         return $$0 * 2;
      } else {
         return this.a == cnq.a.e && $$1.a(apl.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cnd $$0) {
      if ($$0 instanceof cnq $$1) {
         return this.a == $$1.a ? false : this.a == cnq.a.c || $$1.a == cnq.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(biw $$0, int $$1) {
      int $$2 = cnf.a(cnh.b, $$0);
      if ($$2 > 0) {
         $$1 -= aro.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(biw $$0, double $$1) {
      int $$2 = cnf.a(cnh.d, $$0);
      if ($$2 > 0) {
         $$1 *= aro.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
