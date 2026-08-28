public class ctb extends csa {
   public static final int m = 5;
   private final bsb n;

   public ctb(int $$0, cou $$1) {
      this($$0, $$1, new bsp(5));
   }

   public ctb(int $$0, cou $$1, bsb $$2) {
      super(ctj.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new ctx($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cov $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cov $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
