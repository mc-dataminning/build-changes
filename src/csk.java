import java.util.Optional;

public class csk extends csd {
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
   private final bse y;
   private final csp z;
   private final cua A;

   public csk(int $$0, cox $$1) {
      this($$0, $$1, new bss(5), new ctz(2));
   }

   public csk(int $$0, cox $$1, bse $$2, csp $$3) {
      super(ctm.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      cyo $$4 = $$1.k.dV().L();
      this.a(new csk.c($$2, 0, 56, 51));
      this.a(new csk.c($$2, 1, 79, 58));
      this.a(new csk.c($$2, 2, 102, 51));
      this.A = this.a(new csk.b($$4, $$2, 3, 79, 17));
      this.a(new csk.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(coy $$0) {
      return this.y.a($$0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (csk.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwq.j;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwq.j;
               }
            } else if (csk.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwq.j;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwq.j;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwq.j;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
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

   static class a extends cua {
      public a(bse $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwq $$0) {
         return b($$0);
      }

      public static boolean b(cwq $$0) {
         return $$0.a(awy.X);
      }

      @Override
      public akv b() {
         return csk.m;
      }
   }

   static class b extends cua {
      private final cyo a;

      public b(cyo $$0, bse $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwq $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cua {
      public c(bse $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwq $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(coy $$0, cwq $$1) {
         Optional<jr<cyn>> $$2 = $$1.a(kv.Q, cyp.a).e();
         if ($$2.isPresent() && $$0 instanceof are $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwq $$0) {
         return $$0.a(cwu.ti) || $$0.a(cwu.wo) || $$0.a(cwu.wr) || $$0.a(cwu.th);
      }

      @Override
      public akv b() {
         return csk.n;
      }
   }
}
