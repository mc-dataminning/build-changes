public class csq extends cqw {
   private static final int m = 27;
   private final bri n;

   public csq(int $$0, cnt $$1) {
      this($$0, $$1, new brw(27));
   }

   public csq(int $$0, cnt $$1, bri $$2) {
      super(csf.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.d_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new csr($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cnu $$0) {
      return this.n.a($$0);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
