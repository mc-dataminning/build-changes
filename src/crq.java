import java.util.Optional;

public class crq extends crj {
   private static final int m = 0;
   private static final int n = 2;
   private static final int o = 3;
   private static final int p = 4;
   private static final int q = 5;
   private static final int r = 2;
   private static final int s = 5;
   private static final int t = 32;
   private static final int u = 32;
   private static final int v = 41;
   private final brr w;
   private final crv x;
   private final ctg y;

   public crq(int $$0, cog $$1) {
      this($$0, $$1, new bsf(5), new ctf(2));
   }

   public crq(int $$0, cog $$1, brr $$2, crv $$3) {
      super(css.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      cxv $$4 = $$1.k.dX().K();
      this.a(new crq.c($$2, 0, 56, 51));
      this.a(new crq.c($$2, 1, 79, 58));
      this.a(new crq.c($$2, 2, 102, 51));
      this.y = this.a(new crq.b($$4, $$2, 3, 79, 17));
      this.a(new crq.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coh $$0) {
      return this.w.a($$0);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (crq.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cvx.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cvx.k;
               }
            } else if (crq.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cvx.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cvx.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$2);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(1);
   }

   public int m() {
      return this.x.a(0);
   }

   static class a extends ctg {
      public a(brr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvx $$0) {
         return b($$0);
      }

      public static boolean b(cvx $$0) {
         return $$0.a(cwb.sp);
      }
   }

   static class b extends ctg {
      private final cxv a;

      public b(cxv $$0, brr $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cvx $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends ctg {
      public c(brr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cvx $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(coh $$0, cvx $$1) {
         Optional<jp<cxu>> $$2 = $$1.a(kt.P, cxw.a).e();
         if ($$2.isPresent() && $$0 instanceof arn $$3) {
            an.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cvx $$0) {
         return $$0.a(cwb.sm) || $$0.a(cwb.vq) || $$0.a(cwb.vt) || $$0.a(cwb.sl);
      }
   }
}
