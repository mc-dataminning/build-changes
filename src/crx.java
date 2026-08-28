public class crx extends cqw {
   public static final int m = 5;
   private final bri n;

   public crx(int $$0, cnt $$1) {
      this($$0, $$1, new brw(5));
   }

   public crx(int $$0, cnt $$1, bri $$2) {
      super(csf.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.d_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cst($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
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
