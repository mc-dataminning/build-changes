public abstract class cpv extends crh<bqn> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bqn u;
   private final cqe v;
   protected final dby p;
   private final cza<? extends cye> w;
   private final cri x;

   protected cpv(crb<?> $$0, cza<? extends cye> $$1, cri $$2, int $$3, cmw $$4) {
      this($$0, $$1, $$2, $$3, $$4, new brd(3), new cro(4));
   }

   protected cpv(crb<?> $$0, cza<? extends cye> $$1, cri $$2, int $$3, cmw $$4, bqn $$5, cqe $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.l.dP();
      this.a(new crp($$5, 0, 56, 17));
      this.a(new cqp(this, $$5, 1, 56, 53));
      this.a(new cqr($$4.l, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crp($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crp($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cnb $$0) {
      if (this.u instanceof cru) {
         ((cru)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cup.l);
      this.b(2).f(cup.l);
   }

   @Override
   public boolean a(cyx<? extends cyv<bqn>> $$0) {
      return $$0.b().a(this.u, this.p);
   }

   @Override
   public int m() {
      return 2;
   }

   @Override
   public int n() {
      return 1;
   }

   @Override
   public int o() {
      return 1;
   }

   @Override
   public int p() {
      return 3;
   }

   @Override
   public boolean a(cmx $$0) {
      return this.u.a($$0);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cup.l;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cup.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
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

   protected boolean c(cup $$0) {
      return this.p.r().a(this.w, new brd($$0), this.p).isPresent();
   }

   protected boolean d(cup $$0) {
      return dov.c($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? ayz.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayz.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cri t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
