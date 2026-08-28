public class cro extends cpw {
   private static final int k = 27;
   private final bqp l;

   public cro(int $$0, cmy $$1) {
      this($$0, $$1, new brf(27));
   }

   public cro(int $$0, cmy $$1, bqp $$2) {
      super(crd.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crp($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crr($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crr($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cmz $$0) {
      return this.l.a($$0);
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cur.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
