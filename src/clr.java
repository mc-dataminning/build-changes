public abstract class clr extends cnd<bmw> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bmw u;
   private final cma v;
   protected final cxb p;
   private final ctu<? extends csy> w;
   private final cne x;

   protected clr(cmx<?> $$0, ctu<? extends csy> $$1, cne $$2, int $$3, cit $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bnm(3), new cnk(4));
   }

   protected clr(cmx<?> $$0, ctu<? extends csy> $$1, cne $$2, int $$3, cit $$4, bmw $$5, cma $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.m.dM();
      this.a(new cnl($$5, 0, 56, 17));
      this.a(new cml(this, $$5, 1, 56, 53));
      this.a(new cmn($$4.m, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cnl($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cnl($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(ciy $$0) {
      if (this.u instanceof cno) {
         ((cno)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cqm.h);
      this.b(2).f(cqm.h);
   }

   @Override
   public boolean a(ctr<? extends ctp<bmw>> $$0) {
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
   public boolean a(ciu $$0) {
      return this.u.a($$0);
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cqm.h;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cqm.h;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cqm.h;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cqm $$0) {
      return this.p.r().a(this.w, new bnm($$0), this.p).isPresent();
   }

   protected boolean d(cqm $$0) {
      return djx.b($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? aww.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return aww.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cne t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
