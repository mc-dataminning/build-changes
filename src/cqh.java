public class cqh extends cpu {
   public final cqh.a a;

   public cqh(cpu.a $$0, cqh.a $$1, bkv... $$2) {
      super($$0, $$1 == cqh.a.c ? cpv.b : cpv.a, $$2);
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
   public int a(int $$0, bjo $$1) {
      if ($$1.a(ari.d)) {
         return 0;
      } else if (this.a == cqh.a.a) {
         return $$0;
      } else if (this.a == cqh.a.b && $$1.a(ari.i)) {
         return $$0 * 2;
      } else if (this.a == cqh.a.c && $$1.a(ari.m)) {
         return $$0 * 3;
      } else if (this.a == cqh.a.d && $$1.a(ari.l)) {
         return $$0 * 2;
      } else {
         return this.a == cqh.a.e && $$1.a(ari.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cpu $$0) {
      if ($$0 instanceof cqh $$1) {
         return this.a == $$1.a ? false : this.a == cqh.a.c || $$1.a == cqh.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(blg $$0, int $$1) {
      int $$2 = cpw.a(cpy.b, $$0);
      if ($$2 > 0) {
         $$1 -= atm.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(blg $$0, double $$1) {
      int $$2 = cpw.a(cpy.d, $$0);
      if ($$2 > 0) {
         $$1 *= atm.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
