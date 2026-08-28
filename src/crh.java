public class crh extends cpp {
   private static final int k = 27;
   private final bqi l;

   public crh(int $$0, cmr $$1) {
      this($$0, $$1, new bqy(27));
   }

   public crh(int $$0, cmr $$1, bqi $$2) {
      super(cqw.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cri($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crk($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crk($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cms $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
