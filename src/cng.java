public class cng extends clo {
   private static final int k = 27;
   private final bmv l;

   public cng(int $$0, cir $$1) {
      this($$0, $$1, new bnl(27));
   }

   public cng(int $$0, cir $$1, bmv $$2) {
      super(cmv.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.m);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cnh($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cnj($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cnj($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cis $$0) {
      return this.l.a($$0);
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cqk.h;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
