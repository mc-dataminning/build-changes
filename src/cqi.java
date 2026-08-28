public class cqi extends cpp {
   private static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final bqi p;

   public cqi(int $$0, cmr $$1) {
      this($$0, $$1, new bqy(9));
   }

   public cqi(int $$0, cmr $$1, bqi $$2) {
      super(cqw.g, $$0);
      a($$2, 9);
      this.p = $$2;
      $$2.d_($$1.l);

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crk($$2, $$4 + $$3 * 3, 62 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crk($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crk($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cms $$0) {
      return this.p.a($$0);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.p.c($$0);
   }
}
