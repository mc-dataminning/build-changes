public class cta extends crz {
   public static final int m = 5;
   private final bsd n;

   public cta(int $$0, cot $$1) {
      this($$0, $$1, new bsr(5));
   }

   public cta(int $$0, cot $$1, bsd $$2) {
      super(cti.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new ctw($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cou $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
