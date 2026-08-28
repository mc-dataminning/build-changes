public class cvl extends cuk {
   public static final int m = 5;
   private final btr n;

   public cvl(int $$0, cqr $$1) {
      this($$0, $$1, new buf(5));
   }

   public cvl(int $$0, cqr $$1, btr $$2) {
      super(cvt.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cwh($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cqs $$0) {
      return this.n.a($$0);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cys.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
