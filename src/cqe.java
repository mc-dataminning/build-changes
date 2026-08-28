public class cqe extends cpe {
   public static final int k = 5;
   private final bpw l;

   public cqe(int $$0, cmg $$1) {
      this($$0, $$1, new bqm(5));
   }

   public cqe(int $$0, cmg $$1, bpw $$2) {
      super(cqm.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.l);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new cra($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cra($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cra($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean b(cmh $$0) {
      return this.l.a($$0);
   }

   @Override
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cua.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cua.l;
         }

         if ($$4.e()) {
            $$3.e(cua.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cmh $$0) {
      super.a($$0);
      this.l.c($$0);
   }
}
