import java.util.List;

public abstract class cvu extends cxh {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bum w;
   private final cwe x;
   protected final djz r;
   private final dfc<? extends ddx> y;
   private final dfa z;
   private final cxi A;

   protected cvu(cxb<?> $$0, dfc<? extends ddx> $$1, alj<dfa> $$2, cxi $$3, int $$4, cry $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bva(3), new cxo(4));
   }

   protected cvu(cxb<?> $$0, dfc<? extends ddx> $$1, alj<dfa> $$2, cxi $$3, int $$4, cry $$5, bum $$6, cwe $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.h.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cxp($$6, 0, 56, 17));
      this.a(new cwp(this, $$6, 1, 56, 53));
      this.a(new cwr($$5.h, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(csf $$0) {
      if (this.w instanceof cxu) {
         ((cxu)this.w).fillStackedContents($$0);
      }
   }

   public cxp l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(crz $$0) {
      return this.w.a($$0);
   }

   @Override
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return daa.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return daa.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return daa.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return daa.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return daa.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.e(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(daa $$0) {
      return this.z.a($$0);
   }

   protected boolean d(daa $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azq.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azq.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cxi an_() {
      return this.A;
   }

   @Override
   public cxh.a a(boolean $$0, boolean $$1, dew<?> $$2, final aru $$3, cry $$4) {
      final List<cxp> $$5 = List.of(this.b(0), this.b(2));
      return akw.a(new akw.a<ddx>() {
         @Override
         public void a(csf $$0) {
            cvu.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(daa.k));
         }

         @Override
         public boolean a(dew<ddx> $$0) {
            return $$0.b().a(new dfk(cvu.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dew<ddx>)$$2, $$0, $$1);
   }
}
