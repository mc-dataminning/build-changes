public class cty extends csx {
   public static final int m = 5;
   private final bsx n;

   public cty(int $$0, cpr $$1) {
      this($$0, $$1, new btl(5));
   }

   public cty(int $$0, cpr $$1, bsx $$2) {
      super(cug.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cuu($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cps $$0) {
      return this.n.a($$0);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
