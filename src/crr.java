public class crr extends cqq {
   public static final int m = 5;
   private final brd n;

   public crr(int $$0, cno $$1) {
      this($$0, $$1, new brr(5));
   }

   public crr(int $$0, cno $$1, brd $$2) {
      super(crz.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.d_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new csn($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
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
