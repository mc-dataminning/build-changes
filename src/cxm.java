public class cxm extends cwz {
   public final cxm.a b;

   public cxm(cwz.a $$0, cxm.a $$1, bqh... $$2) {
      super($$0, $$1 == cxm.a.c ? avm.bb : avm.bf, $$2);
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
   public int a(int $$0, boy $$1) {
      if ($$1.a(avg.e)) {
         return 0;
      } else if (this.b == cxm.a.a) {
         return $$0;
      } else if (this.b == cxm.a.b && $$1.a(avg.j)) {
         return $$0 * 2;
      } else if (this.b == cxm.a.c && $$1.a(avg.n)) {
         return $$0 * 3;
      } else if (this.b == cxm.a.d && $$1.a(avg.m)) {
         return $$0 * 2;
      } else {
         return this.b == cxm.a.e && $$1.a(avg.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cwz $$0) {
      if ($$0 instanceof cxm $$1) {
         return this.b == $$1.b ? false : this.b == cxm.a.c || $$1.b == cxm.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bqt $$0, int $$1) {
      int $$2 = cxa.a(cxc.b, $$0);
      if ($$2 > 0) {
         $$1 -= axm.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bqt $$0, double $$1) {
      int $$2 = cxa.a(cxc.d, $$0);
      if ($$2 > 0) {
         $$1 *= axm.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
