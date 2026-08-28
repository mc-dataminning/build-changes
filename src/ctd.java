public class ctd extends csc {
   public static final int m = 5;
   private final bsd n;

   public ctd(int $$0, cow $$1) {
      this($$0, $$1, new bsr(5));
   }

   public ctd(int $$0, cow $$1, bsd $$2) {
      super(ctl.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new ctz($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cox $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
