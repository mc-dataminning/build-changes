import java.util.List;

public abstract class csc extends ctp {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bsb w;
   private final csm x;
   protected final dgg r;
   private final dbn<? extends dai> y;
   private final dbl z;
   private final ctq A;

   protected csc(ctj<?> $$0, dbn<? extends dai> $$1, akt<dbl> $$2, ctq $$3, int $$4, cou $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bsp(3), new ctw(4));
   }

   protected csc(ctj<?> $$0, dbn<? extends dai> $$1, akt<dbl> $$2, ctq $$3, int $$4, cou $$5, bsb $$6, csm $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dW();
      this.z = this.r.Q().a($$2);
      this.a(new ctx($$6, 0, 56, 17));
      this.a(new csx(this, $$6, 1, 56, 53));
      this.a(new csz($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cpa $$0) {
      if (this.w instanceof cuc) {
         ((cuc)this.w).fillStackedContents($$0);
      }
   }

   public ctx l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cov $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwn.j;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cwn.j;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cwn.j;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwn $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cwn $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? ayy.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayy.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public ctq am_() {
      return this.A;
   }

   @Override
   public ctp.a a(boolean $$0, boolean $$1, dbh<?> $$2, final arc $$3, cou $$4) {
      final List<ctx> $$5 = List.of(this.b(0), this.b(2));
      return akg.a(new akg.a<dai>() {
         @Override
         public void a(cpa $$0) {
            csc.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cwn.j));
         }

         @Override
         public boolean a(dbh<dai> $$0) {
            return $$0.b().a(new dbv(csc.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dbh<dai>)$$2, $$0, $$1);
   }
}
