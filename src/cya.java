public class cya extends cxn {
   public final cya.a b;

   public cya(cxn.a $$0, cya.a $$1, bqs... $$2) {
      super($$0, $$1 == cya.a.c ? avw.bb : avw.bf, $$2);
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
   public int a(int $$0, bpj $$1) {
      if ($$1.a(avq.e)) {
         return 0;
      } else if (this.b == cya.a.a) {
         return $$0;
      } else if (this.b == cya.a.b && $$1.a(avq.j)) {
         return $$0 * 2;
      } else if (this.b == cya.a.c && $$1.a(avq.n)) {
         return $$0 * 3;
      } else if (this.b == cya.a.d && $$1.a(avq.m)) {
         return $$0 * 2;
      } else {
         return this.b == cya.a.e && $$1.a(avq.k) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cxn $$0) {
      if ($$0 instanceof cya $$1) {
         return this.b == $$1.b ? false : this.b == cya.a.c || $$1.b == cya.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bre $$0, int $$1) {
      int $$2 = cxo.a(cxq.b, $$0);
      if ($$2 > 0) {
         $$1 -= axw.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bre $$0, double $$1) {
      int $$2 = cxo.a(cxq.d, $$0);
      if ($$2 > 0) {
         $$1 *= axw.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
