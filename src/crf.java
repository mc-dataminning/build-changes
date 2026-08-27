public class crf extends cqs {
   public final crf.a a;

   public crf(cqs.a $$0, crf.a $$1, blk... $$2) {
      super($$0, $$1 == crf.a.c ? cqt.b : cqt.a, $$2);
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
   public int a(int $$0, bkd $$1) {
      if ($$1.a(art.e)) {
         return 0;
      } else if (this.a == crf.a.a) {
         return $$0;
      } else if (this.a == crf.a.b && $$1.a(art.j)) {
         return $$0 * 2;
      } else if (this.a == crf.a.c && $$1.a(art.n)) {
         return $$0 * 3;
      } else if (this.a == crf.a.d && $$1.a(art.m)) {
         return $$0 * 2;
      } else {
         return this.a == crf.a.e && $$1.a(art.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cqs $$0) {
      if ($$0 instanceof crf $$1) {
         return this.a == $$1.a ? false : this.a == crf.a.c || $$1.a == crf.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(blv $$0, int $$1) {
      int $$2 = cqu.a(cqw.b, $$0);
      if ($$2 > 0) {
         $$1 -= aty.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(blv $$0, double $$1) {
      int $$2 = cqu.a(cqw.d, $$0);
      if ($$2 > 0) {
         $$1 *= aty.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
