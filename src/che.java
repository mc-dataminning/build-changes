public class che extends cfp {
   private static final int k = 27;
   private final bhu l;

   public che(int $$0, ccw $$1) {
      this($$0, $$1, new bii(27));
   }

   public che(int $$0, ccw $$1, bhu $$2) {
      super(cgu.t, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.m);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new chf($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new chh($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new chh($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return this.l.a($$0);
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ckj $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return ckj.b;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return ckj.b;
         }

         if ($$4.b()) {
            $$3.d(ckj.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(ccx $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
