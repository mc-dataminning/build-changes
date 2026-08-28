public class cru extends cqz {
   private static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final brl r;

   public cru(int $$0, cnw $$1) {
      this($$0, $$1, new brz(9));
   }

   public cru(int $$0, cnw $$1, brl $$2) {
      super(csi.g, $$0);
      a($$2, 9);
      this.r = $$2;
      $$2.d_($$1.k);
      this.d($$2, 62, 17);
      this.c($$1, 8, 84);
   }

   protected void d(brl $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            int $$5 = $$4 + $$3 * 3;
            this.a(new csw($$0, $$5, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cnx $$0) {
      return this.r.a($$0);
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.e(cvs.k);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.r.c($$0);
   }
}
