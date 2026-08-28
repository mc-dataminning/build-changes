public class cqn extends cpu {
   private static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final bqn p;

   public cqn(int $$0, cmw $$1) {
      this($$0, $$1, new brd(9));
   }

   public cqn(int $$0, cmw $$1, bqn $$2) {
      super(crb.g, $$0);
      a($$2, 9);
      this.p = $$2;
      $$2.d_($$1.l);

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crp($$2, $$4 + $$3 * 3, 62 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crp($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crp($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return this.p.a($$0);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cup.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.p.c($$0);
   }
}
