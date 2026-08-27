public class cob extends cno {
   public final cob.a a;

   public cob(cno.a $$0, cob.a $$1, biv... $$2) {
      super($$0, $$1 == cob.a.c ? cnp.b : cnp.a, $$2);
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
   public int a(int $$0, bho $$1) {
      if ($$1.a(apu.d)) {
         return 0;
      } else if (this.a == cob.a.a) {
         return $$0;
      } else if (this.a == cob.a.b && $$1.a(apu.i)) {
         return $$0 * 2;
      } else if (this.a == cob.a.c && $$1.a(apu.m)) {
         return $$0 * 3;
      } else if (this.a == cob.a.d && $$1.a(apu.l)) {
         return $$0 * 2;
      } else {
         return this.a == cob.a.e && $$1.a(apu.j) ? $$0 * 2 : 0;
      }
   }

   @Override
   public boolean a(cno $$0) {
      if ($$0 instanceof cob $$1) {
         return this.a == $$1.a ? false : this.a == cob.a.c || $$1.a == cob.a.c;
      } else {
         return super.a($$0);
      }
   }

   public static int a(bjg $$0, int $$1) {
      int $$2 = cnq.a(cns.b, $$0);
      if ($$2 > 0) {
         $$1 -= arw.d((float)$$1 * (float)$$2 * 0.15F);
      }

      return $$1;
   }

   public static double a(bjg $$0, double $$1) {
      int $$2 = cnq.a(cns.d, $$0);
      if ($$2 > 0) {
         $$1 *= arw.a(1.0 - (double)$$2 * 0.15, 0.0, 1.0);
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
