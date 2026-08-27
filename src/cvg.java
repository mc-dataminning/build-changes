public class cvg extends cuu {
   public final cvg.a b;

   public cvg(cuu.a $$0, cvg.a $$1, bpd... $$2) {
      super($$0, $$1 == cvg.a.c ? auv.bb : auv.bf, $$2);
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
   public int a(int $$0, bnv $$1) {
      if ($$1.a(aup.e)) {
         return 0;
      } else if (this.b == cvg.a.a) {
         return $$0;
      } else if (this.b == cvg.a.b && $$1.a(aup.j)) {
         return $$0 * 2;
      } else if (this.b == cvg.a.c && $$1.a(aup.n)) {
         return $$0 * 3;
      } else if (this.b == cvg.a.d && $$1.a(aup.m)) {
         return $$0 * 2;
      } else {
         return this.b == cvg.a.e && $$1.a(aup.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cuu $$0) {
      if ($$0 instanceof cvg $$1) {
         return this.b == $$1.b ? false : this.b == cvg.a.c || $$1.b == cvg.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bpo $$0, int $$1) {
      int $$2 = cuv.a(cux.b, $$0);
      if ($$2 > 0) {
         $$1 -= aww.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bpo $$0, double $$1) {
      int $$2 = cuv.a(cux.d, $$0);
      if ($$2 > 0) {
         $$1 *= aww.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
