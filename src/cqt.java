public class cqt extends cpu {
   public static final int k = 5;
   private final bqn l;

   public cqt(int $$0, cmw $$1) {
      this($$0, $$1, new brd(5));
   }

   public cqt(int $$0, cmw $$1, bqn $$2) {
      super(crb.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.l);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new crp($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crp($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crp($$1, $$7, 8 + $$7 * 18, 109));
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
