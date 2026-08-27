public class cxd extends cwq {
   public final cxd.a b;

   public cxd(cwq.a $$0, cxd.a $$1, bqc... $$2) {
      super($$0, $$1 == cxd.a.c ? avk.bb : avk.bf, $$2);
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
   public int a(int $$0, bot $$1) {
      if ($$1.a(ave.e)) {
         return 0;
      } else if (this.b == cxd.a.a) {
         return $$0;
      } else if (this.b == cxd.a.b && $$1.a(ave.j)) {
         return $$0 * 2;
      } else if (this.b == cxd.a.c && $$1.a(ave.n)) {
         return $$0 * 3;
      } else if (this.b == cxd.a.d && $$1.a(ave.m)) {
         return $$0 * 2;
      } else {
         return this.b == cxd.a.e && $$1.a(ave.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cwq $$0) {
      if ($$0 instanceof cxd $$1) {
         return this.b == $$1.b ? false : this.b == cxd.a.c || $$1.b == cxd.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bqo $$0, int $$1) {
      int $$2 = cwr.a(cwt.b, $$0);
      if ($$2 > 0) {
         $$1 -= axk.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bqo $$0, double $$1) {
      int $$2 = cwr.a(cwt.d, $$0);
      if ($$2 > 0) {
         $$1 *= axk.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
