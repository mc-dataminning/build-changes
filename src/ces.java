public class ces extends cel {
   private static final int k = 9;
   private final bgr l;
   private final int m;

   private ces(cfq<?> $$0, int $$1, cbt $$2, int $$3) {
      this($$0, $$1, $$2, new bhf(9 * $$3), $$3);
   }

   public static ces a(int $$0, cbt $$1) {
      return new ces(cfq.a, $$0, $$1, 1);
   }

   public static ces b(int $$0, cbt $$1) {
      return new ces(cfq.b, $$0, $$1, 2);
   }

   public static ces c(int $$0, cbt $$1) {
      return new ces(cfq.c, $$0, $$1, 3);
   }

   public static ces d(int $$0, cbt $$1) {
      return new ces(cfq.d, $$0, $$1, 4);
   }

   public static ces e(int $$0, cbt $$1) {
      return new ces(cfq.e, $$0, $$1, 5);
   }

   public static ces f(int $$0, cbt $$1) {
      return new ces(cfq.f, $$0, $$1, 6);
   }

   public static ces a(int $$0, cbt $$1, bgr $$2) {
      return new ces(cfq.c, $$0, $$1, $$2, 3);
   }

   public static ces b(int $$0, cbt $$1, bgr $$2) {
      return new ces(cfq.f, $$0, $$1, $$2, 6);
   }

   public ces(cfq<?> $$0, int $$1, cbt $$2, bgr $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cgd($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cgd($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cgd($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return this.l.a($$0);
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cjf.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cjf.b;
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbu $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bgr l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
