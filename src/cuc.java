public class cuc extends ctb {
   public static final int m = 5;
   private final btb n;

   public cuc(int $$0, cpv $$1) {
      this($$0, $$1, new btp(5));
   }

   public cuc(int $$0, cpv $$1, btb $$2) {
      super(cuk.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cuy($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cpw $$0) {
      return this.n.a($$0);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.j;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cxo.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cxo.j;
         }

         if ($$4.f()) {
            $$3.e(cxo.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
