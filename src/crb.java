public class crb extends cpg {
   private static final int k = 27;
   private final bpt l;

   public crb(int $$0, clx $$1) {
      this($$0, $$1, new bqj(27));
   }

   public crb(int $$0, clx $$1, bpt $$2) {
      super(cqo.v, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crc($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cre($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cre($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cly $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
