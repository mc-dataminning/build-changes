public class cwt extends cvs {
   public static final int m = 5;
   private final bum n;

   public cwt(int $$0, cry $$1) {
      this($$0, $$1, new bva(5));
   }

   public cwt(int $$0, cry $$1, bum $$2) {
      super(cxb.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.h);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cxp($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(crz $$0) {
      return this.n.a($$0);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return daa.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crz $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
