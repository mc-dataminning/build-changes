public class cvr extends cuq {
   public static final int m = 5;
   private final btu n;

   public cvr(int $$0, cqx $$1) {
      this($$0, $$1, new bui(5));
   }

   public cvr(int $$0, cqx $$1, btu $$2) {
      super(cvz.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cwn($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cqy $$0) {
      return this.n.a($$0);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
