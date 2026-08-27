public class cqm extends cpz {
   public final cqm.a a;

   public cqm(cpz.a $$0, cqm.a $$1, bla... $$2) {
      super($$0, $$1 == cqm.a.c ? cqa.b : cqa.a, $$2);
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
   public int a(int $$0, bjt $$1) {
      if ($$1.a(arm.d)) {
         return 0;
      } else if (this.a == cqm.a.a) {
         return $$0;
      } else if (this.a == cqm.a.b && $$1.a(arm.i)) {
         return $$0 * 2;
      } else if (this.a == cqm.a.c && $$1.a(arm.m)) {
         return $$0 * 3;
      } else if (this.a == cqm.a.d && $$1.a(arm.l)) {
         return $$0 * 2;
      } else {
         return this.a == cqm.a.e && $$1.a(arm.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cpz $$0) {
      if ($$0 instanceof cqm $$1) {
         return this.a == $$1.a ? false : this.a == cqm.a.c || $$1.a == cqm.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bll $$0, int $$1) {
      int $$2 = cqb.a(cqd.b, $$0);
      if ($$2 > 0) {
         $$1 -= atq.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bll $$0, double $$1) {
      int $$2 = cqb.a(cqd.d, $$0);
      if ($$2 > 0) {
         $$1 *= atq.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
