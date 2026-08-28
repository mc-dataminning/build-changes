import java.util.Optional;

public class crz extends crs {
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
   private final bsa w;
   private final cse x;
   private final ctp y;

   public crz(int $$0, coq $$1) {
      this($$0, $$1, new bso(5), new cto(2));
   }

   public crz(int $$0, coq $$1, bsa $$2, cse $$3) {
      super(ctb.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      cyd $$4 = $$1.k.dY().K();
      this.a(new crz.c($$2, 0, 56, 51));
      this.a(new crz.c($$2, 1, 79, 58));
      this.a(new crz.c($$2, 2, 102, 51));
      this.y = this.a(new crz.b($$4, $$2, 3, 79, 17));
      this.a(new crz.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cor $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (crz.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwf.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwf.k;
               }
            } else if (crz.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwf.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwf.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwf.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwf.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
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

   static class a extends ctp {
      public a(bsa $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwf $$0) {
         return b($$0);
      }

      public static boolean b(cwf $$0) {
         return $$0.a(axm.Y);
      }
   }

   static class b extends ctp {
      private final cyd a;

      public b(cyd $$0, bsa $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwf $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends ctp {
      public c(bsa $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwf $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cor $$0, cwf $$1) {
         Optional<jq<cyc>> $$2 = $$1.a(ku.Q, cye.a).e();
         if ($$2.isPresent() && $$0 instanceof arr $$3) {
            ao.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwf $$0) {
         return $$0.a(cwj.sC) || $$0.a(cwj.vG) || $$0.a(cwj.vJ) || $$0.a(cwj.sB);
      }
   }
}
