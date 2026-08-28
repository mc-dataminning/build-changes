public class cpm extends cpe {
   private static final int k = 9;
   private final bpw l;
   private final int m;

   private cpm(cqm<?> $$0, int $$1, cmg $$2, int $$3) {
      this($$0, $$1, $$2, new bqm(9 * $$3), $$3);
   }

   public static cpm a(int $$0, cmg $$1) {
      return new cpm(cqm.a, $$0, $$1, 1);
   }

   public static cpm b(int $$0, cmg $$1) {
      return new cpm(cqm.b, $$0, $$1, 2);
   }

   public static cpm c(int $$0, cmg $$1) {
      return new cpm(cqm.c, $$0, $$1, 3);
   }

   public static cpm d(int $$0, cmg $$1) {
      return new cpm(cqm.d, $$0, $$1, 4);
   }

   public static cpm e(int $$0, cmg $$1) {
      return new cpm(cqm.e, $$0, $$1, 5);
   }

   public static cpm f(int $$0, cmg $$1) {
      return new cpm(cqm.f, $$0, $$1, 6);
   }

   public static cpm a(int $$0, cmg $$1, bpw $$2) {
      return new cpm(cqm.c, $$0, $$1, $$2, 3);
   }

   public static cpm b(int $$0, cmg $$1, bpw $$2) {
      return new cpm(cqm.f, $$0, $$1, $$2, 6);
   }

   public cpm(cqm<?> $$0, int $$1, cmg $$2, bpw $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cra($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cra($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cra($$2, $$10, 8 + $$10 * 18, 161 + $$5));
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
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cua.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
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

   public bpw l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
