import java.util.Optional;

public class csj extends csc {
   static final akv m = akv.b("container/slot/brewing_fuel");
   static final akv n = akv.b("container/slot/potion");
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
   private final bsd y;
   private final cso z;
   private final ctz A;

   public csj(int $$0, cow $$1) {
      this($$0, $$1, new bsr(5), new cty(2));
   }

   public csj(int $$0, cow $$1, bsd $$2, cso $$3) {
      super(ctl.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      cyn $$4 = $$1.k.dV().L();
      this.a(new csj.c($$2, 0, 56, 51));
      this.a(new csj.c($$2, 1, 79, 58));
      this.a(new csj.c($$2, 2, 102, 51));
      this.A = this.a(new csj.b($$4, $$2, 3, 79, 17));
      this.a(new csj.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cox $$0) {
      return this.y.a($$0);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (csj.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwp.j;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwp.j;
               }
            } else if (csj.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwp.j;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwp.j;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwp.j;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwp.j;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
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

   static class a extends ctz {
      public a(bsd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwp $$0) {
         return b($$0);
      }

      public static boolean b(cwp $$0) {
         return $$0.a(awy.X);
      }

      @Override
      public akv b() {
         return csj.m;
      }
   }

   static class b extends ctz {
      private final cyn a;

      public b(cyn $$0, bsd $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwp $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends ctz {
      public c(bsd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwp $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cox $$0, cwp $$1) {
         Optional<jr<cym>> $$2 = $$1.a(kv.Q, cyo.a).e();
         if ($$2.isPresent() && $$0 instanceof are $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwp $$0) {
         return $$0.a(cwt.ti) || $$0.a(cwt.wo) || $$0.a(cwt.wr) || $$0.a(cwt.th);
      }

      @Override
      public akv b() {
         return csj.n;
      }
   }
}
