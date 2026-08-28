public class cst extends crs {
   public static final int m = 5;
   private final bsa n;

   public cst(int $$0, coq $$1) {
      this($$0, $$1, new bso(5));
   }

   public cst(int $$0, coq $$1, bsa $$2) {
      super(ctb.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.d_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new ctp($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cor $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
