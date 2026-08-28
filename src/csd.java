import java.util.List;

public abstract class csd extends ctq {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bsc w;
   private final csn x;
   protected final dgh r;
   private final dbo<? extends daj> y;
   private final dbm z;
   private final ctr A;

   protected csd(ctk<?> $$0, dbo<? extends daj> $$1, aku<dbm> $$2, ctr $$3, int $$4, cov $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bsq(3), new ctx(4));
   }

   protected csd(ctk<?> $$0, dbo<? extends daj> $$1, aku<dbm> $$2, ctr $$3, int $$4, cov $$5, bsc $$6, csn $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cty($$6, 0, 56, 17));
      this.a(new csy(this, $$6, 1, 56, 53));
      this.a(new cta($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cpb $$0) {
      if (this.w instanceof cud) {
         ((cud)this.w).fillStackedContents($$0);
      }
   }

   public cty l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cow $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwo.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwo.j;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cwo.j;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cwo.j;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cwo.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwo.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwo $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cwo $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? ayz.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayz.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public ctr am_() {
      return this.A;
   }

   @Override
   public ctq.a a(boolean $$0, boolean $$1, dbi<?> $$2, final ard $$3, cov $$4) {
      final List<cty> $$5 = List.of(this.b(0), this.b(2));
      return akh.a(new akh.a<daj>() {
         @Override
         public void a(cpb $$0) {
            csd.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cwo.j));
         }

         @Override
         public boolean a(dbi<daj> $$0) {
            return $$0.b().a(new dbw(csd.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dbi<daj>)$$2, $$0, $$1);
   }
}
