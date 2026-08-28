import java.util.Optional;

public class csi extends csb {
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
   private final bsc y;
   private final csn z;
   private final cty A;

   public csi(int $$0, cov $$1) {
      this($$0, $$1, new bsq(5), new ctx(2));
   }

   public csi(int $$0, cov $$1, bsc $$2, csn $$3) {
      super(ctk.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      cym $$4 = $$1.k.dV().L();
      this.a(new csi.c($$2, 0, 56, 51));
      this.a(new csi.c($$2, 1, 79, 58));
      this.a(new csi.c($$2, 2, 102, 51));
      this.A = this.a(new csi.b($$4, $$2, 3, 79, 17));
      this.a(new csi.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cow $$0) {
      return this.y.a($$0);
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (csi.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwo.j;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwo.j;
               }
            } else if (csi.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwo.j;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwo.j;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwo.j;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwo.j;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwo.j;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwo.j;
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

   static class a extends cty {
      public a(bsc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwo $$0) {
         return b($$0);
      }

      public static boolean b(cwo $$0) {
         return $$0.a(awy.X);
      }

      @Override
      public akv b() {
         return csi.m;
      }
   }

   static class b extends cty {
      private final cym a;

      public b(cym $$0, bsc $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwo $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cty {
      public c(bsc $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwo $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cow $$0, cwo $$1) {
         Optional<jr<cyl>> $$2 = $$1.a(kv.Q, cyn.a).e();
         if ($$2.isPresent() && $$0 instanceof are $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwo $$0) {
         return $$0.a(cws.ti) || $$0.a(cws.wo) || $$0.a(cws.wr) || $$0.a(cws.th);
      }

      @Override
      public akv b() {
         return csi.n;
      }
   }
}
