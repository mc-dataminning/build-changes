public class crm extends cpu {
   private static final int k = 27;
   private final bqn l;

   public crm(int $$0, cmw $$1) {
      this($$0, $$1, new brd(27));
   }

   public crm(int $$0, cmw $$1, bqn $$2) {
      super(crb.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crn($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crp($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crp($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return this.l.a($$0);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cup.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
