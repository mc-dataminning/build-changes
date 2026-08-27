public abstract class clp extends cnb<bmv> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bmv u;
   private final cly v;
   protected final cwz p;
   private final cts<? extends csw> w;
   private final cnc x;

   protected clp(cmv<?> $$0, cts<? extends csw> $$1, cnc $$2, int $$3, cir $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bnl(3), new cni(4));
   }

   protected clp(cmv<?> $$0, cts<? extends csw> $$1, cnc $$2, int $$3, cir $$4, bmv $$5, cly $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.m.dM();
      this.a(new cnj($$5, 0, 56, 17));
      this.a(new cmj(this, $$5, 1, 56, 53));
      this.a(new cml($$4.m, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cnj($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cnj($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(ciw $$0) {
      if (this.u instanceof cnm) {
         ((cnm)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cqk.h);
      this.b(2).f(cqk.h);
   }

   @Override
   public boolean a(ctp<? extends ctn<bmv>> $$0) {
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
   public boolean a(cis $$0) {
      return this.u.a($$0);
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cqk.h;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cqk.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cqk $$0) {
      return this.p.r().a(this.w, new bnl($$0), this.p).isPresent();
   }

   protected boolean d(cqk $$0) {
      return djv.b($$0);
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
   public cnc t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
