public class cud extends ctc {
   public static final int m = 5;
   private final btc n;

   public cud(int $$0, cpw $$1) {
      this($$0, $$1, new btq(5));
   }

   public cud(int $$0, cpw $$1, btc $$2) {
      super(cul.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cuz($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cpx $$0) {
      return this.n.a($$0);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
