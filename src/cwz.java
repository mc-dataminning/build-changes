public class cwz extends cvf {
   private static final int m = 27;
   private final btz n;

   public cwz(int $$0, crl $$1) {
      this($$0, $$1, new bun(27));
   }

   public cwz(int $$0, crl $$1, btz $$2) {
      super(cwo.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.h);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cxa($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crm $$0) {
      return this.n.a($$0);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return czn.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
