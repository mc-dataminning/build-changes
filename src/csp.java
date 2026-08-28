public class csp extends cro {
   public static final int m = 5;
   private final brw n;

   public csp(int $$0, col $$1) {
      this($$0, $$1, new bsk(5));
   }

   public csp(int $$0, col $$1, brw $$2) {
      super(csx.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.d_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new ctl($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(com $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
