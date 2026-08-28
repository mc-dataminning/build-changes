public class cqc extends cpv {
   private static final int k = 9;
   private final bqo l;
   private final int m;

   private cqc(crc<?> $$0, int $$1, cmx $$2, int $$3) {
      this($$0, $$1, $$2, new bre(9 * $$3), $$3);
   }

   public static cqc a(int $$0, cmx $$1) {
      return new cqc(crc.a, $$0, $$1, 1);
   }

   public static cqc b(int $$0, cmx $$1) {
      return new cqc(crc.b, $$0, $$1, 2);
   }

   public static cqc c(int $$0, cmx $$1) {
      return new cqc(crc.c, $$0, $$1, 3);
   }

   public static cqc d(int $$0, cmx $$1) {
      return new cqc(crc.d, $$0, $$1, 4);
   }

   public static cqc e(int $$0, cmx $$1) {
      return new cqc(crc.e, $$0, $$1, 5);
   }

   public static cqc f(int $$0, cmx $$1) {
      return new cqc(crc.f, $$0, $$1, 6);
   }

   public static cqc a(int $$0, cmx $$1, bqo $$2) {
      return new cqc(crc.c, $$0, $$1, $$2, 3);
   }

   public static cqc b(int $$0, cmx $$1, bqo $$2) {
      return new cqc(crc.f, $$0, $$1, $$2, 6);
   }

   public cqc(crc<?> $$0, int $$1, cmx $$2, bqo $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crq($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crq($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crq($$2, $$10, 8 + $$10 * 18, 161 + $$5));
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
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
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

   public bqo l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
