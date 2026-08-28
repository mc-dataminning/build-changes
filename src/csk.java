public class csk extends crj {
   public static final int m = 5;
   private final brr n;

   public csk(int $$0, cog $$1) {
      this($$0, $$1, new bsf(5));
   }

   public csk(int $$0, cog $$1, brr $$2) {
      super(css.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.d_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new ctg($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(coh $$0) {
      return this.n.a($$0);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
