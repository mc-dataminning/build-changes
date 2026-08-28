public class crn extends cpv {
   private static final int k = 27;
   private final bqo l;

   public crn(int $$0, cmx $$1) {
      this($$0, $$1, new bre(27));
   }

   public crn(int $$0, cmx $$1, bqo $$2) {
      super(crc.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cro($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crq($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crq($$1, $$9, 8 + $$9 * 18, 142));
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
