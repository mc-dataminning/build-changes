import java.util.List;

public abstract class cte extends cur {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final btc w;
   private final cto x;
   protected final dhi r;
   private final dcp<? extends dbk> y;
   private final dcn z;
   private final cus A;

   protected cte(cul<?> $$0, dcp<? extends dbk> $$1, aly<dcn> $$2, cus $$3, int $$4, cpw $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new btq(3), new cuy(4));
   }

   protected cte(cul<?> $$0, dcp<? extends dbk> $$1, aly<dcn> $$2, cus $$3, int $$4, cpw $$5, btc $$6, cto $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dW();
      this.z = this.r.P().a($$2);
      this.a(new cuz($$6, 0, 56, 17));
      this.a(new ctz(this, $$6, 1, 56, 53));
      this.a(new cub($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cqc $$0) {
      if (this.w instanceof cve) {
         ((cve)this.w).fillStackedContents($$0);
      }
   }

   public cuz l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cpx $$0) {
      return this.w.a($$0);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cxp.j;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cxp.j;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cxp.j;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cxp $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cxp $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? bae.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return bae.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cus an_() {
      return this.A;
   }

   @Override
   public cur.a a(boolean $$0, boolean $$1, dcj<?> $$2, final ash $$3, cpw $$4) {
      final List<cuz> $$5 = List.of(this.b(0), this.b(2));
      return all.a(new all.a<dbk>() {
         @Override
         public void a(cqc $$0) {
            cte.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cxp.j));
         }

         @Override
         public boolean a(dcj<dbk> $$0) {
            return $$0.b().a(new dcx(cte.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dcj<dbk>)$$2, $$0, $$1);
   }
}
