public class cqb extends cpu {
   private static final int k = 9;
   private final bqn l;
   private final int m;

   private cqb(crb<?> $$0, int $$1, cmw $$2, int $$3) {
      this($$0, $$1, $$2, new brd(9 * $$3), $$3);
   }

   public static cqb a(int $$0, cmw $$1) {
      return new cqb(crb.a, $$0, $$1, 1);
   }

   public static cqb b(int $$0, cmw $$1) {
      return new cqb(crb.b, $$0, $$1, 2);
   }

   public static cqb c(int $$0, cmw $$1) {
      return new cqb(crb.c, $$0, $$1, 3);
   }

   public static cqb d(int $$0, cmw $$1) {
      return new cqb(crb.d, $$0, $$1, 4);
   }

   public static cqb e(int $$0, cmw $$1) {
      return new cqb(crb.e, $$0, $$1, 5);
   }

   public static cqb f(int $$0, cmw $$1) {
      return new cqb(crb.f, $$0, $$1, 6);
   }

   public static cqb a(int $$0, cmw $$1, bqn $$2) {
      return new cqb(crb.c, $$0, $$1, $$2, 3);
   }

   public static cqb b(int $$0, cmw $$1, bqn $$2) {
      return new cqb(crb.f, $$0, $$1, $$2, 6);
   }

   public cqb(crb<?> $$0, int $$1, cmw $$2, bqn $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crp($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crp($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crp($$2, $$10, 8 + $$10 * 18, 161 + $$5));
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
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cup.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
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

   public bqn l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
