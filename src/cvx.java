import java.util.Optional;

public class cvx extends cvq {
   static final ali m = ali.b("container/slot/brewing_fuel");
   static final ali n = ali.b("container/slot/potion");
   private static final int o = 0;
   private static final int p = 2;
   private static final int q = 3;
   private static final int r = 4;
   private static final int s = 5;
   private static final int t = 2;
   private static final int u = 5;
   private static final int v = 32;
   private static final int w = 32;
   private static final int x = 41;
   private final buk y;
   private final cwc z;
   private final cxn A;

   public cvx(int $$0, crw $$1) {
      this($$0, $$1, new buy(5), new cxm(2));
   }

   public cvx(int $$0, crw $$1, buk $$2, cwc $$3) {
      super(cwz.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      dbt $$4 = $$1.h.dV().L();
      this.a(new cvx.c($$2, 0, 56, 51));
      this.a(new cvx.c($$2, 1, 79, 58));
      this.a(new cvx.c($$2, 2, 102, 51));
      this.A = this.a(new cvx.b($$4, $$2, 3, 79, 17));
      this.a(new cvx.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crx $$0) {
      return this.y.a($$0);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cvx.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return czy.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return czy.k;
               }
            } else if (cvx.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return czy.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return czy.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$2);
      }

      return $$2;
   }

   public int l() {
      return this.z.a(1);
   }

   public int m() {
      return this.z.a(0);
   }

   static class a extends cxn {
      public a(buk $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czy $$0) {
         return b($$0);
      }

      public static boolean b(czy $$0) {
         return $$0.a(axm.X);
      }

      @Override
      public ali c() {
         return cvx.m;
      }
   }

   static class b extends cxn {
      private final dbt a;

      public b(dbt $$0, buk $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(czy $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cxn {
      public c(buk $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czy $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(crx $$0, czy $$1) {
         Optional<jf<dbs>> $$2 = $$1.a(kk.R, dbu.a).e();
         if ($$2.isPresent() && $$0 instanceof art $$3) {
            aq.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(czy $$0) {
         return $$0.a(dac.tt) || $$0.a(dac.wz) || $$0.a(dac.wC) || $$0.a(dac.ts);
      }

      @Override
      public ali c() {
         return cvx.n;
      }
   }
}
