import java.util.List;

public abstract class cum extends cvz {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final btr w;
   private final cuw x;
   protected final dip r;
   private final ddu<? extends dcp> y;
   private final dds z;
   private final cwa A;

   protected cum(cvt<?> $$0, ddu<? extends dcp> $$1, ald<dds> $$2, cwa $$3, int $$4, cqr $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new buf(3), new cwg(4));
   }

   protected cum(cvt<?> $$0, ddu<? extends dcp> $$1, ald<dds> $$2, cwa $$3, int $$4, cqr $$5, btr $$6, cuw $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cwh($$6, 0, 56, 17));
      this.a(new cvh(this, $$6, 1, 56, 53));
      this.a(new cvj($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(cqx $$0) {
      if (this.w instanceof cwm) {
         ((cwm)this.w).fillStackedContents($$0);
      }
   }

   public cwh l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cqs $$0) {
      return this.w.a($$0);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cys.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cys $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cys $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azk.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azk.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cwa ai_() {
      return this.A;
   }

   @Override
   public cvz.a a(boolean $$0, boolean $$1, ddo<?> $$2, final aro $$3, cqr $$4) {
      final List<cwh> $$5 = List.of(this.b(0), this.b(2));
      return akq.a(new akq.a<dcp>() {
         @Override
         public void a(cqx $$0) {
            cum.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cys.k));
         }

         @Override
         public boolean a(ddo<dcp> $$0) {
            return $$0.b().a(new dec(cum.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (ddo<dcp>)$$2, $$0, $$1);
   }
}
