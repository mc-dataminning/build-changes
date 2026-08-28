public class cqm extends cpt {
   private static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final bqm p;

   public cqm(int $$0, cmv $$1) {
      this($$0, $$1, new brc(9));
   }

   public cqm(int $$0, cmv $$1, bqm $$2) {
      super(cra.g, $$0);
      a($$2, 9);
      this.p = $$2;
      $$2.d_($$1.l);

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cro($$2, $$4 + $$3 * 3, 62 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cro($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cro($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cmw $$0) {
      return this.p.a($$0);
   }

   @Override
   public cuo a(cmw $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cuo.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cmw $$0) {
      super.b($$0);
      this.p.c($$0);
   }
}
