public abstract class cmq extends coc<bnt> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bnt u;
   private final cmz v;
   protected final cyx p;
   private final cvo<? extends cus> w;
   private final cod x;

   protected cmq(cnw<?> $$0, cvo<? extends cus> $$1, cod $$2, int $$3, cjs $$4) {
      this($$0, $$1, $$2, $$3, $$4, new boj(3), new coj(4));
   }

   protected cmq(cnw<?> $$0, cvo<? extends cus> $$1, cod $$2, int $$3, cjs $$4, bnt $$5, cmz $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.m.dM();
      this.a(new cok($$5, 0, 56, 17));
      this.a(new cnk(this, $$5, 1, 56, 53));
      this.a(new cnm($$4.m, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cok($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cok($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cjx $$0) {
      if (this.u instanceof coo) {
         ((coo)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(crj.i);
      this.b(2).f(crj.i);
   }

   @Override
   public boolean a(cvl<? extends cvj<bnt>> $$0) {
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
   public boolean a(cjt $$0) {
      return this.u.a($$0);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return crj.i;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(crj $$0) {
      return this.p.r().a(this.w, new boj($$0), this.p).isPresent();
   }

   protected boolean d(crj $$0) {
      return dlt.b($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? axk.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return axk.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cod t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
