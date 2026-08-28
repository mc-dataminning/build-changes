import java.util.Optional;

public class cvc extends cuv {
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
   private final btw y;
   private final cvh z;
   private final cws A;

   public cvc(int $$0, crb $$1) {
      this($$0, $$1, new buk(5), new cwr(2));
   }

   public cvc(int $$0, crb $$1, btw $$2, cvh $$3) {
      super(cwe.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      day $$4 = $$1.h.dV().L();
      this.a(new cvc.c($$2, 0, 56, 51));
      this.a(new cvc.c($$2, 1, 79, 58));
      this.a(new cvc.c($$2, 2, 102, 51));
      this.A = this.a(new cvc.b($$4, $$2, 3, 79, 17));
      this.a(new cvc.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crc $$0) {
      return this.y.a($$0);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cvc.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return czd.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return czd.k;
               }
            } else if (cvc.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return czd.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return czd.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return czd.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return czd.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
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

   static class a extends cws {
      public a(btw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czd $$0) {
         return b($$0);
      }

      public static boolean b(czd $$0) {
         return $$0.a(axk.X);
      }

      @Override
      public alg c() {
         return cvc.m;
      }
   }

   static class b extends cws {
      private final day a;

      public b(day $$0, btw $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(czd $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cws {
      public c(btw $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czd $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(crc $$0, czd $$1) {
         Optional<je<dax>> $$2 = $$1.a(kj.R, daz.a).e();
         if ($$2.isPresent() && $$0 instanceof arr $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(czd $$0) {
         return $$0.a(czh.tt) || $$0.a(czh.wz) || $$0.a(czh.wC) || $$0.a(czh.ts);
      }

      @Override
      public alg c() {
         return cvc.n;
      }
   }
}
