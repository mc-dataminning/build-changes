import java.util.List;

public abstract class cwd extends cxq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final buv w;
   private final cwn x;
   protected final dkj r;
   private final dfm<? extends deh> y;
   private final dfk z;
   private final cxr A;

   protected cwd(cxk<?> $$0, dfm<? extends deh> $$1, alq<dfk> $$2, cxr $$3, int $$4, csh $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bvj(3), new cxy(4));
   }

   protected cwd(cxk<?> $$0, dfm<? extends deh> $$1, alq<dfk> $$2, cxr $$3, int $$4, csh $$5, buv $$6, cwn $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.h.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cxz($$6, 0, 56, 17));
      this.a(new cwy(this, $$6, 1, 56, 53));
      this.a(new cxa($$5.h, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cso $$0) {
      if (this.w instanceof cye) {
         ((cye)this.w).fillStackedContents($$0);
      }
   }

   public cxz l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(csi $$0) {
      return this.w.a($$0);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.b($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return dak.l;
               }
            } else if (this.c($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return dak.l;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return dak.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return dak.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean b(dak $$0) {
      return this.z.a($$0);
   }

   protected boolean c(dak $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azz.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azz.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cxr ao_() {
      return this.A;
   }

   @Override
   public cxq.a a(boolean $$0, boolean $$1, dfg<?> $$2, final asb $$3, csh $$4) {
      final List<cxz> $$5 = List.of(this.b(0), this.b(2));
      return ald.a(new ald.a<deh>() {
         @Override
         public void a(cso $$0) {
            cwd.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(dak.l));
         }

         @Override
         public boolean a(dfg<deh> $$0) {
            return $$0.b().a(new dfu(cwd.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dfg<deh>)$$2, $$0, $$1);
   }
}
