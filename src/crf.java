public class crf extends cqw {
   private final bri m;
   private final int n;

   private crf(csf<?> $$0, int $$1, cnt $$2, int $$3) {
      this($$0, $$1, $$2, new brw(9 * $$3), $$3);
   }

   public static crf a(int $$0, cnt $$1) {
      return new crf(csf.a, $$0, $$1, 1);
   }

   public static crf b(int $$0, cnt $$1) {
      return new crf(csf.b, $$0, $$1, 2);
   }

   public static crf c(int $$0, cnt $$1) {
      return new crf(csf.c, $$0, $$1, 3);
   }

   public static crf d(int $$0, cnt $$1) {
      return new crf(csf.d, $$0, $$1, 4);
   }

   public static crf e(int $$0, cnt $$1) {
      return new crf(csf.e, $$0, $$1, 5);
   }

   public static crf f(int $$0, cnt $$1) {
      return new crf(csf.f, $$0, $$1, 6);
   }

   public static crf a(int $$0, cnt $$1, bri $$2) {
      return new crf(csf.c, $$0, $$1, $$2, 3);
   }

   public static crf b(int $$0, cnt $$1, bri $$2) {
      return new crf(csf.f, $$0, $$1, $$2, 6);
   }

   public crf(csf<?> $$0, int $$1, cnt $$2, bri $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.d_($$2.k);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(bri $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cst($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cnu $$0) {
      return this.m.a($$0);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bri l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
