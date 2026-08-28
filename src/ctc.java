public class ctc extends csb {
   public static final int m = 5;
   private final bsc n;

   public ctc(int $$0, cov $$1) {
      this($$0, $$1, new bsq(5));
   }

   public ctc(int $$0, cov $$1, bsc $$2) {
      super(ctk.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cty($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cow $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwo.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cow $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
