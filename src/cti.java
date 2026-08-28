public class cti extends cro {
   private static final int m = 27;
   private final brw n;

   public cti(int $$0, col $$1) {
      this($$0, $$1, new bsk(27));
   }

   public cti(int $$0, col $$1, brw $$2) {
      super(csx.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.d_($$1.k);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new ctj($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(com $$0) {
      return this.n.a($$0);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
