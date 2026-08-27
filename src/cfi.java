public class cfi extends cel {
   public static final int k = 5;
   private final bgr l;

   public cfi(int $$0, cbt $$1) {
      this($$0, $$1, new bhf(5));
   }

   public cfi(int $$0, cbt $$1, bgr $$2) {
      super(cfq.p, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.m);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cgd($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cgd($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cgd($$1, $$7, 8 + $$7 * 18, 109));
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
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cjf.b;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
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
}
