public class cqr extends cps {
   public static final int k = 5;
   private final bql l;

   public cqr(int $$0, cmu $$1) {
      this($$0, $$1, new brb(5));
   }

   public cqr(int $$0, cmu $$1, bql $$2) {
      super(cqz.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.l);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new crn($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crn($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crn($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return this.l.a($$0);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cun.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cun.l;
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
