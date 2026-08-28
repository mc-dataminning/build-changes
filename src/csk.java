public class csk extends cqq {
   private static final int m = 27;
   private final brd n;

   public csk(int $$0, cno $$1) {
      this($$0, $$1, new brr(27));
   }

   public csk(int $$0, cno $$1, brd $$2) {
      super(crz.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.d_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new csl($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnp $$0) {
      return this.n.a($$0);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
