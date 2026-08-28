import java.util.Optional;

public class csh extends csa {
   static final aku m = aku.b("container/slot/brewing_fuel");
   static final aku n = aku.b("container/slot/potion");
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
   private final bsb y;
   private final csm z;
   private final ctx A;

   public csh(int $$0, cou $$1) {
      this($$0, $$1, new bsp(5), new ctw(2));
   }

   public csh(int $$0, cou $$1, bsb $$2, csm $$3) {
      super(ctj.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      cyl $$4 = $$1.k.dW().L();
      this.a(new csh.c($$2, 0, 56, 51));
      this.a(new csh.c($$2, 1, 79, 58));
      this.a(new csh.c($$2, 2, 102, 51));
      this.A = this.a(new csh.b($$4, $$2, 3, 79, 17));
      this.a(new csh.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cov $$0) {
      return this.y.a($$0);
   }

   @Override
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (csh.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwn.j;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwn.j;
               }
            } else if (csh.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwn.j;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwn.j;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwn.j;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwn.j;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwn.j;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
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

   static class a extends ctx {
      public a(bsb $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwn $$0) {
         return b($$0);
      }

      public static boolean b(cwn $$0) {
         return $$0.a(awx.X);
      }

      @Override
      public aku b() {
         return csh.m;
      }
   }

   static class b extends ctx {
      private final cyl a;

      public b(cyl $$0, bsb $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwn $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends ctx {
      public c(bsb $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwn $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cov $$0, cwn $$1) {
         Optional<jr<cyk>> $$2 = $$1.a(kv.Q, cym.a).e();
         if ($$2.isPresent() && $$0 instanceof ard $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwn $$0) {
         return $$0.a(cwr.ti) || $$0.a(cwr.wo) || $$0.a(cwr.wr) || $$0.a(cwr.th);
      }

      @Override
      public aku b() {
         return csh.n;
      }
   }
}
