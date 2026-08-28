import java.util.List;

public abstract class cqs extends csf {
   public static final int m = 0;
   public static final int n = 1;
   public static final int o = 2;
   public static final int p = 3;
   public static final int q = 4;
   private static final int s = 3;
   private static final int t = 30;
   private static final int u = 30;
   private static final int v = 39;
   final brd w;
   private final crc x;
   protected final dds r;
   private final czz<? extends cza> y;
   private final csg z;

   protected cqs(crz<?> $$0, czz<? extends cza> $$1, csg $$2, int $$3, cno $$4) {
      this($$0, $$1, $$2, $$3, $$4, new brr(3), new csm(4));
   }

   protected cqs(crz<?> $$0, czz<? extends cza> $$1, csg $$2, int $$3, cno $$4, brd $$5, crc $$6) {
      super($$0, $$3);
      this.y = $$1;
      this.z = $$2;
      a($$5, 3);
      a($$6, 4);
      this.w = $$5;
      this.x = $$6;
      this.r = $$4.k.dS();
      this.a(new csn($$5, 0, 56, 17));
      this.a(new crn(this, $$5, 1, 56, 53));
      this.a(new crp($$4.k, $$5, 2, 116, 35));
      this.c($$4, 8, 84);
      this.a($$6);
   }

   @Override
   public void a(cnu $$0) {
      if (this.w instanceof css) {
         ((css)this.w).fillStackedContents($$0);
      }
   }

   public csn l() {
      return this.k.get(2);
   }

   @Override
   public boolean b(cnp $$0) {
      return this.w.a($$0);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cvl.k;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cvl $$0) {
      return this.r.r().a(this.y, new daj($$0), this.r).isPresent();
   }

   protected boolean d(cvl $$0) {
      return this.r.L().a($$0);
   }

   public float m() {
      int $$0 = this.x.a(2);
      int $$1 = this.x.a(3);
      return $$1 != 0 && $$0 != 0 ? azc.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float n() {
      int $$0 = this.x.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return azc.a((float)this.x.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean o() {
      return this.x.a(0) > 0;
   }

   @Override
   public csg am_() {
      return this.z;
   }

   @Override
   public csf.a a(boolean $$0, boolean $$1, czv<?> $$2, cno $$3) {
      final List<csn> $$4 = List.of(this.b(0), this.b(2));
      return akp.a(new akp.a<cza>() {
         @Override
         public void a(cnu $$0) {
            cqs.this.a($$0);
         }

         @Override
         public void a() {
            $$4.forEach($$0 -> $$0.f(cvl.k));
         }

         @Override
         public boolean a(czv<cza> $$0) {
            return $$0.b().a(new daj(cqs.this.w.a(0)), cqs.this.r);
         }
      }, 1, 1, List.of(this.b(0)), $$4, $$3, (czv<cza>)$$2, $$0, $$1);
   }
}
