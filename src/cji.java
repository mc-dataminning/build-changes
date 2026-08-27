public class cji extends cij {
   public static final int k = 5;
   private final bjv l;

   public cji(int $$0, cfp $$1) {
      this($$0, $$1, new bkl(5));
   }

   public cji(int $$0, cfp $$1, bjv $$2) {
      super(cjq.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.m);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cke($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cke($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cke($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return this.l.a($$0);
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cng.f;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
