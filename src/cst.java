public class cst extends cqz {
   private static final int m = 27;
   private final brl n;

   public cst(int $$0, cnw $$1) {
      this($$0, $$1, new brz(27));
   }

   public cst(int $$0, cnw $$1, brl $$2) {
      super(csi.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.d_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new csu($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnx $$0) {
      return this.n.a($$0);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
