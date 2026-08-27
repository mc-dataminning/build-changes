public class cle extends ckf {
   public static final int k = 5;
   private final blp l;

   public cle(int $$0, chk $$1) {
      this($$0, $$1, new bmf(5));
   }

   public cle(int $$0, chk $$1, blp $$2) {
      super(clm.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.m);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cma($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cma($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cma($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean a(chl $$0) {
      return this.l.a($$0);
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cpd.h;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(chl $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
