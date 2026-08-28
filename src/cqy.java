import java.util.List;

public abstract class cqy extends csl {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final bri w;
   private final cri x;
   protected final deg r;
   private final dan<? extends czo> y;
   private final csm z;

   protected cqy(csf<?> $$0, dan<? extends czo> $$1, csm $$2, int $$3, cnt $$4) {
      this($$0, $$1, $$2, $$3, $$4, new brw(3), new css(4));
   }

   protected cqy(csf<?> $$0, dan<? extends czo> $$1, csm $$2, int $$3, cnt $$4, bri $$5, cri $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dS();
      this.a(new cst($$5, 0, 56, 17));
      this.a(new crt(this, $$5, 1, 56, 53));
      this.a(new crv($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(cnz $$0) {
      if (this.w instanceof csy) {
         ((csy)this.w).fillStackedContents($$0);
      }
   }

   public cst l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cnu $$0) {
      return this.w.a($$0);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvp.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cvp.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cvp.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cvp $$0) {
      return this.r.r().a(this.y, new dax($$0), this.r).isPresent();
   }

   protected boolean d(cvp $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azd.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azd.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public csm am_() {
      return this.z;
   }

   @Override
   public csl.a a(boolean $$0, boolean $$1, daj<?> $$2, cnt $$3) {
      final List<cst> $$4 = List.of(this.b(0), this.b(2));
      return akp.a(new akp.a<czo>() {
         @Override
         public void a(cnz $$0) {
            cqy.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cvp.k));
         }

         @Override
         public boolean a(daj<czo> $$0) {
            return $$0.b().a(new dax(cqy.this.w.a(0)), cqy.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (daj<czo>)$$2, $$0, $$1);
   }
}
