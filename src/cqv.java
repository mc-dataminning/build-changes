public class cqv extends cqw<bpt> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   public static final int p = 4;
   private static final int r = 4;
   private static final int s = 31;
   private static final int t = 31;
   private static final int u = 40;
   private final bpt v;
   private final cpq w;
   protected final dca q;
   private final czf<cyz> x;
   private final cqx y;

   public cqv(int $$0, clx $$1) {
      this($$0, $$1, new bqj(4), new crd(4));
   }

   public cqv(int $$0, clx $$1, bpt $$2, cpq $$3) {
      this(cqo.B, czf.i, cqx.b, $$0, $$1, $$2, $$3);
   }

   private cqv(cqo<?> $$0, czf<cyz> $$1, cqx $$2, int $$3, clx $$4, bpt $$5, cpq $$6) {
      super($$0, $$3);
      this.x = $$1;
      this.y = $$2;
      a($$5, 4);
      a($$6, 4);
      this.v = $$5;
      this.w = $$6;
      this.q = $$4.l.dU();
      this.a(new cre($$5, 0, 52, 33));
      this.a(new cre($$5, 2, 107, 36));
      this.a(new cqv.a($$5, 1, 52, 71));
      this.a(new cqv.b($$4.l, $$5, 3, 107, 62));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cre($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 104 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cre($$4, $$9, 8 + $$9 * 18, 162));
      }

      this.a($$6);
   }

   @Override
   public void a(cmc $$0) {
      if (this.v instanceof crj) {
         ((crj)this.v).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cuh.i);
      this.b(2).f(cuh.i);
      this.b(3).f(cuh.i);
   }

   @Override
   public boolean a(czc<? extends cza<bpt>> $$0) {
      return $$0.b().a(this.v, this.q);
   }

   @Override
   public int m() {
      return 3;
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
   public boolean a(cly $$0) {
      return this.v.a($$0);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 3) {
            if (!this.a($$4, 4, 40, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuh.i;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 4 && $$1 < 31) {
               if (!this.a($$4, 31, 40, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 31 && $$1 < 40 && !this.a($$4, 4, 31, false)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 4, 40, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cuh $$0) {
      return this.q.r().a(this.x, new bqj($$0), this.q).isPresent();
   }

   protected boolean d(cuh $$0) {
      return drl.c($$0);
   }

   public float q() {
      int $$0 = this.w.a(2);
      int $$1 = this.w.a(3);
      return $$1 != 0 && $$0 != 0 ? aym.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.w.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return aym.a((float)this.w.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.w.a(0) > 0;
   }

   @Override
   public cqx t() {
      return this.y;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }

   class a extends cre {
      public a(bpt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuh $$0) {
         return cqv.this.d($$0) || d($$0);
      }

      @Override
      public int a_(cuh $$0) {
         return d($$0) ? 1 : super.a_($$0);
      }

      public static boolean d(cuh $$0) {
         return $$0.a(cuk.rV);
      }
   }

   static class b extends cre {
      private final cly a;
      private int b;

      public b(cly $$0, bpt $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cuh $$0) {
         return false;
      }

      @Override
      public cuh a(int $$0) {
         if (this.h()) {
            this.b = this.b + Math.min($$0, this.g().G());
         }

         return super.a($$0);
      }

      @Override
      public void a(cly $$0, cuh $$1) {
         this.d($$1);
         super.a($$0, $$1);
      }

      @Override
      protected void a(cuh $$0, int $$1) {
         this.b += $$1;
         this.d($$0);
      }

      protected void d(cuh $$0) {
         $$0.a(this.a.dU(), this.a, this.b);
         this.b = 0;
         if (this.a instanceof aqu $$1 && this.d instanceof drl $$2) {
            an.aj.a($$1, $$0);
            float $$3 = $$2.l();
            if ($$3 > 0.0F) {
               a($$1.B(), $$1.ds(), 1, $$3);
            }
         }
      }

      private static void a(aqt $$0, ewu $$1, int $$2, float $$3) {
         int $$4 = aym.d((float)$$2 * $$3);
         float $$5 = aym.h((float)$$2 * $$3);
         if ($$5 != 0.0F && Math.random() < (double)$$5) {
            $$4++;
         }

         bse.a($$0, $$1, $$4);
      }
   }
}
