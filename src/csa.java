public class csa extends cqz {
   public static final int m = 5;
   private final brl n;

   public csa(int $$0, cnw $$1) {
      this($$0, $$1, new brz(5));
   }

   public csa(int $$0, cnw $$1, brl $$2) {
      super(csi.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.d_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new csw($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
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
