import java.util.Optional;

public class ctu extends ctn {
   static final ald m = ald.b("container/slot/brewing_fuel");
   static final ald n = ald.b("container/slot/potion");
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
   private final btj y;
   private final ctz z;
   private final cvk A;

   public ctu(int $$0, cqh $$1) {
      this($$0, $$1, new btx(5), new cvj(2));
   }

   public ctu(int $$0, cqh $$1, btj $$2, ctz $$3) {
      super(cuw.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      czt $$4 = $$1.k.dV().L();
      this.a(new ctu.c($$2, 0, 56, 51));
      this.a(new ctu.c($$2, 1, 79, 58));
      this.a(new ctu.c($$2, 2, 102, 51));
      this.A = this.a(new ctu.b($$4, $$2, 3, 79, 17));
      this.a(new ctu.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqi $$0) {
      return this.y.a($$0);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (ctu.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cxy.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cxy.k;
               }
            } else if (ctu.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cxy.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cxy.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cxy.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cxy.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
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

   static class a extends cvk {
      public a(btj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxy $$0) {
         return b($$0);
      }

      public static boolean b(cxy $$0) {
         return $$0.a(axi.X);
      }

      @Override
      public ald c() {
         return ctu.m;
      }
   }

   static class b extends cvk {
      private final czt a;

      public b(czt $$0, btj $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cxy $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cvk {
      public c(btj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxy $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cqi $$0, cxy $$1) {
         Optional<js<czs>> $$2 = $$1.a(kx.R, czu.a).e();
         if ($$2.isPresent() && $$0 instanceof aro $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cxy $$0) {
         return $$0.a(cyc.tm) || $$0.a(cyc.ws) || $$0.a(cyc.wv) || $$0.a(cyc.tl);
      }

      @Override
      public ald c() {
         return ctu.n;
      }
   }
}
