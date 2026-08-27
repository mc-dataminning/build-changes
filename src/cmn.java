public class cmn extends clo {
   public static final int k = 5;
   private final bmv l;

   public cmn(int $$0, cir $$1) {
      this($$0, $$1, new bnl(5));
   }

   public cmn(int $$0, cir $$1, bmv $$2) {
      super(cmv.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.m);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cnj($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cnj($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cnj($$1, $$7, 8 + $$7 * 18, 109));
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
