import java.util.Optional;

public class cvj extends cvc {
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
   private final btz y;
   private final cvo z;
   private final cwz A;

   public cvj(int $$0, cri $$1) {
      this($$0, $$1, new bun(5), new cwy(2));
   }

   public cvj(int $$0, cri $$1, btz $$2, cvo $$3) {
      super(cwl.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      dbf $$4 = $$1.h.dU().L();
      this.a(new cvj.c($$2, 0, 56, 51));
      this.a(new cvj.c($$2, 1, 79, 58));
      this.a(new cvj.c($$2, 2, 102, 51));
      this.A = this.a(new cvj.b($$4, $$2, 3, 79, 17));
      this.a(new cvj.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crj $$0) {
      return this.y.a($$0);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cvj.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return czk.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return czk.k;
               }
            } else if (cvj.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return czk.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return czk.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return czk.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return czk.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return czk.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czk.k;
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

   static class a extends cwz {
      public a(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czk $$0) {
         return b($$0);
      }

      public static boolean b(czk $$0) {
         return $$0.a(axk.X);
      }

      @Override
      public alg c() {
         return cvj.m;
      }
   }

   static class b extends cwz {
      private final dbf a;

      public b(dbf $$0, btz $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(czk $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cwz {
      public c(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czk $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(crj $$0, czk $$1) {
         Optional<jf<dbe>> $$2 = $$1.a(kk.R, dbg.a).e();
         if ($$2.isPresent() && $$0 instanceof arr $$3) {
            aq.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(czk $$0) {
         return $$0.a(czo.tt) || $$0.a(czo.wz) || $$0.a(czo.wC) || $$0.a(czo.ts);
      }

      @Override
      public alg c() {
         return cvj.n;
      }
   }
}
