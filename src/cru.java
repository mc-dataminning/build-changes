import java.util.List;

public abstract class cru extends cth {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bsa w;
   private final cse x;
   protected final dff r;
   private final daz<? extends daa> y;
   private final cti z;

   protected cru(ctb<?> $$0, daz<? extends daa> $$1, cti $$2, int $$3, coq $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bso(3), new cto(4));
   }

   protected cru(ctb<?> $$0, daz<? extends daa> $$1, cti $$2, int $$3, coq $$4, bsa $$5, cse $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dY();
      this.a(new ctp($$5, 0, 56, 17));
      this.a(new csp(this, $$5, 1, 56, 53));
      this.a(new csr($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(cow $$0) {
      if (this.w instanceof ctu) {
         ((ctu)this.w).fillStackedContents($$0);
      }
   }

   public ctp l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cor $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cwf.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cwf.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cwf.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cwf $$0) {
      return this.r.r().a(this.y, new dbi($$0), this.r).isPresent();
   }

   protected boolean d(cwf $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azn.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azn.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public cti ao_() {
      return this.z;
   }

   @Override
   public cth.a a(boolean $$0, boolean $$1, dav<?> $$2, coq $$3) {
      final List<ctp> $$4 = List.of(this.b(0), this.b(2));
      return akx.a(new akx.a<daa>() {
         @Override
         public void a(cow $$0) {
            cru.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cwf.k));
         }

         @Override
         public boolean a(dav<daa> $$0) {
            return $$0.b().a(new dbi(cru.this.w.a(0)), cru.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (dav<daa>)$$2, $$0, $$1);
   }
}
