public class cit extends chu {
   public static final int k = 5;
   private final bjo l;

   public cit(int $$0, cfa $$1) {
      this($$0, $$1, new bkd(5));
   }

   public cit(int $$0, cfa $$1, bjo $$2) {
      super(cjb.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.m);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cjp($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cjp($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cjp($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return this.l.a($$0);
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cmr.f;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cfb $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
