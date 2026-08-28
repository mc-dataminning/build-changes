public class cww extends cvc {
   private static final int m = 27;
   private final btz n;

   public cww(int $$0, cri $$1) {
      this($$0, $$1, new bun(27));
   }

   public cww(int $$0, cri $$1, btz $$2) {
      super(cwl.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.h);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cwx($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crj $$0) {
      return this.n.a($$0);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return czk.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
