import java.util.List;

public abstract class cus extends cwf {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final btu w;
   private final cvc x;
   protected final div r;
   private final dea<? extends dcv> y;
   private final ddy z;
   private final cwg A;

   protected cus(cvz<?> $$0, dea<? extends dcv> $$1, alf<ddy> $$2, cwg $$3, int $$4, cqx $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bui(3), new cwm(4));
   }

   protected cus(cvz<?> $$0, dea<? extends dcv> $$1, alf<ddy> $$2, cwg $$3, int $$4, cqx $$5, btu $$6, cvc $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.k.dV();
      this.z = this.r.Q().a($$2);
      this.a(new cwn($$6, 0, 56, 17));
      this.a(new cvn(this, $$6, 1, 56, 53));
      this.a(new cvp($$5.k, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(crd $$0) {
      if (this.w instanceof cws) {
         ((cws)this.w).fillStackedContents($$0);
      }
   }

   public cwn l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cqy $$0) {
      return this.w.a($$0);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cyy.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cyy $$0) {
      return this.z.a($$0);
   }

   protected boolean d(cyy $$0) {
      return this.r.M().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azm.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azm.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cwg ai_() {
      return this.A;
   }

   @Override
   public cwf.a a(boolean $$0, boolean $$1, ddu<?> $$2, final arq $$3, cqx $$4) {
      final List<cwn> $$5 = List.of(this.b(0), this.b(2));
      return aks.a(new aks.a<dcv>() {
         @Override
         public void a(crd $$0) {
            cus.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(cyy.k));
         }

         @Override
         public boolean a(ddu<dcv> $$0) {
            return $$0.b().a(new dei(cus.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (ddu<dcv>)$$2, $$0, $$1);
   }
}
