public abstract class cpj extends cqw<cyz, cxr> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bqa u;
   private final cpt v;
   protected final dcg p;
   private final cyp<? extends cxr> w;
   private final cqx x;

   protected cpj(cqq<?> $$0, cyp<? extends cxr> $$1, cqx $$2, int $$3, cmk $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bqq(3), new crd(4));
   }

   protected cpj(cqq<?> $$0, cyp<? extends cxr> $$1, cqx $$2, int $$3, cmk $$4, bqa $$5, cpt $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.l.dR();
      this.a(new cre($$5, 0, 56, 17));
      this.a(new cqe(this, $$5, 1, 56, 53));
      this.a(new cqg($$4.l, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cre($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cre($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cmp $$0) {
      if (this.u instanceof crj) {
         ((crj)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cud.l);
      this.b(2).f(cud.l);
   }

   @Override
   public boolean a(cyl<cxr> $$0) {
      return $$0.b().a(new cyz(this.u.a(0)), this.p);
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
   public boolean b(cml $$0) {
      return this.u.a($$0);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cud.l;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cud.l;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cud.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cud.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cud $$0) {
      return this.p.r().a(this.w, new cyz($$0), this.p).isPresent();
   }

   protected boolean d(cud $$0) {
      return dpe.c($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? ayg.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayg.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cqx t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
