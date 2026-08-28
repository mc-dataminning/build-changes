public class cwg extends cvf {
   public static final int m = 5;
   private final btz n;

   public cwg(int $$0, crl $$1) {
      this($$0, $$1, new bun(5));
   }

   public cwg(int $$0, crl $$1, btz $$2) {
      super(cwo.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.h);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cxc($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
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
