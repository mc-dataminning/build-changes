import java.util.List;

public abstract class cvh extends cwu {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final btz w;
   private final cvr x;
   protected final djm r;
   private final dep<? extends ddk> y;
   private final den z;
   private final cwv A;

   protected cvh(cwo<?> $$0, dep<? extends ddk> $$1, alf<den> $$2, cwv $$3, int $$4, crl $$5) {
      this($$0, $$1, $$2, $$3, $$4, $$5, new bun(3), new cxb(4));
   }

   protected cvh(cwo<?> $$0, dep<? extends ddk> $$1, alf<den> $$2, cwv $$3, int $$4, crl $$5, btz $$6, cvr $$7) {
      super($$0, $$4);
      this.y = $$1;
      this.A = $$3;
      a($$6, 3);
      a($$7, 4);
      this.w = $$6;
      this.x = $$7;
      this.r = $$5.h.dU();
      this.z = this.r.Q().a($$2);
      this.a(new cxc($$6, 0, 56, 17));
      this.a(new cwc(this, $$6, 1, 56, 53));
      this.a(new cwe($$5.h, $$6, 2, 116, 35));
      this.c($$5, 8, 84);
      this.a($$7);
   }

   @Override
   public void a(crs $$0) {
      if (this.w instanceof cxh) {
         ((cxh)this.w).fillStackedContents($$0);
      }
   }

   public cxc l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(crm $$0) {
      return this.w.a($$0);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return czn.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return czn.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return czn.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return czn.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(czn $$0) {
      return this.z.a($$0);
   }

   protected boolean d(czn $$0) {
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
   public cwv aj_() {
      return this.A;
   }

   @Override
   public cwu.a a(boolean $$0, boolean $$1, dej<?> $$2, final arq $$3, crl $$4) {
      final List<cxc> $$5 = List.of(this.b(0), this.b(2));
      return aks.a(new aks.a<ddk>() {
         @Override
         public void a(crs $$0) {
            cvh.this.a($$0);
         }

         @Override
         public void a() {
            $$5.forEach($$0 -> $$0.f(czn.k));
         }

         @Override
         public boolean a(dej<ddk> $$0) {
            return $$0.b().a(new dex(cvh.this.w.a(0)), $$3);
         }
      }, 1, 1, List.of(this.b(0)), $$5, $$4, (dej<ddk>)$$2, $$0, $$1);
   }
}
