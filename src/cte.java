public class cte extends csd {
   public static final int m = 5;
   private final bse n;

   public cte(int $$0, cox $$1) {
      this($$0, $$1, new bss(5));
   }

   public cte(int $$0, cox $$1, bse $$2) {
      super(ctm.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cua($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(coy $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
