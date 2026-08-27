public abstract class cou extends cqg<bpn> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bpn u;
   private final cpd v;
   protected final dax p;
   private final cxz<? extends cxd> w;
   private final cqh x;

   protected cou(cqa<?> $$0, cxz<? extends cxd> $$1, cqh $$2, int $$3, clv $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bqd(3), new cqn(4));
   }

   protected cou(cqa<?> $$0, cxz<? extends cxd> $$1, cqh $$2, int $$3, clv $$4, bpn $$5, cpd $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.l.dP();
      this.a(new cqo($$5, 0, 56, 17));
      this.a(new cpo(this, $$5, 1, 56, 53));
      this.a(new cpq($$4.l, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cqo($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cqo($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cma $$0) {
      if (this.u instanceof cqt) {
         ((cqt)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cto.i);
      this.b(2).f(cto.i);
   }

   @Override
   public boolean a(cxw<? extends cxu<bpn>> $$0) {
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
   public boolean a(clw $$0) {
      return this.u.a($$0);
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cto.i;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cto $$0) {
      return this.p.r().a(this.w, new bqd($$0), this.p).isPresent();
   }

   protected boolean d(cto $$0) {
      return dnu.c($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? ayd.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayd.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cqh t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
