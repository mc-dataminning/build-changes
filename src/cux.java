import java.util.Optional;

public class cux extends cuq {
   static final alg m = alg.b("container/slot/brewing_fuel");
   static final alg n = alg.b("container/slot/potion");
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
   private final btu y;
   private final cvc z;
   private final cwn A;

   public cux(int $$0, cqx $$1) {
      this($$0, $$1, new bui(5), new cwm(2));
   }

   public cux(int $$0, cqx $$1, btu $$2, cvc $$3) {
      super(cvz.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      dat $$4 = $$1.k.dV().L();
      this.a(new cux.c($$2, 0, 56, 51));
      this.a(new cux.c($$2, 1, 79, 58));
      this.a(new cux.c($$2, 2, 102, 51));
      this.A = this.a(new cux.b($$4, $$2, 3, 79, 17));
      this.a(new cux.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqy $$0) {
      return this.y.a($$0);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cux.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cyy.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cyy.k;
               }
            } else if (cux.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cyy.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cyy.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
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

   static class a extends cwn {
      public a(btu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cyy $$0) {
         return b($$0);
      }

      public static boolean b(cyy $$0) {
         return $$0.a(axk.X);
      }

      @Override
      public alg c() {
         return cux.m;
      }
   }

   static class b extends cwn {
      private final dat a;

      public b(dat $$0, btu $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cyy $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cwn {
      public c(btu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cyy $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cqy $$0, cyy $$1) {
         Optional<je<das>> $$2 = $$1.a(kj.R, dau.a).e();
         if ($$2.isPresent() && $$0 instanceof arr $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cyy $$0) {
         return $$0.a(czc.to) || $$0.a(czc.wu) || $$0.a(czc.wx) || $$0.a(czc.tn);
      }

      @Override
      public alg c() {
         return cux.n;
      }
   }
}
