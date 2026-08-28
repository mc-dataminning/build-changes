public class cqh extends cph {
   public static final int k = 5;
   private final bpz l;

   public cqh(int $$0, cmj $$1) {
      this($$0, $$1, new bqp(5));
   }

   public cqh(int $$0, cmj $$1, bpz $$2) {
      super(cqp.q, $$0);
      this.l = $$2;
      a($$2, 5);
      $$2.d_($$1.l);
      int $$3 = 51;

      for (int $$4 = 0; $$4 < 5; $$4++) {
         this.a(new crd($$2, $$4, 44 + $$4 * 18, 20));
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crd($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, $$5 * 18 + 51));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crd($$1, $$7, 8 + $$7 * 18, 109));
      }
   }

   @Override
   public boolean b(cmk $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.l.c($$0);
   }
}
