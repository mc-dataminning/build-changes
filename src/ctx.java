public class ctx extends csw {
   public static final int m = 5;
   private final bsr n;

   public ctx(int $$0, cpq $$1) {
      this($$0, $$1, new btf(5));
   }

   public ctx(int $$0, cpq $$1, bsr $$2) {
      super(cuf.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cut($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cpr $$0) {
      return this.n.a($$0);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
