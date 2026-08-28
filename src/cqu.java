public class cqu extends cpv {
   public static final int k = 5;
   private final bqo l;

   public cqu(int $$0, cmx $$1) {
      this($$0, $$1, new bre(5));
   }

   public cqu(int $$0, cmx $$1, bqo $$2) {
      super(crc.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.l);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new crq($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crq($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crq($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean a(cmy $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuq a(cmy $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmy $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
