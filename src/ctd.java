import java.util.Optional;

public class ctd extends csw {
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
   private final bsr y;
   private final cti z;
   private final cut A;

   public ctd(int $$0, cpq $$1) {
      this($$0, $$1, new btf(5), new cus(2));
   }

   public ctd(int $$0, cpq $$1, bsr $$2, cti $$3) {
      super(cuf.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      czd $$4 = $$1.k.dU().L();
      this.a(new ctd.c($$2, 0, 56, 51));
      this.a(new ctd.c($$2, 1, 79, 58));
      this.a(new ctd.c($$2, 2, 102, 51));
      this.A = this.a(new ctd.b($$4, $$2, 3, 79, 17));
      this.a(new ctd.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpr $$0) {
      return this.y.a($$0);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (ctd.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cxh.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cxh.k;
               }
            } else if (ctd.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cxh.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cxh.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cxh.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cxh.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
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

   static class a extends cut {
      public a(bsr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxh $$0) {
         return b($$0);
      }

      public static boolean b(cxh $$0) {
         return $$0.a(awy.X);
      }

      @Override
      public aku b() {
         return ctd.m;
      }
   }

   static class b extends cut {
      private final czd a;

      public b(czd $$0, bsr $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cxh $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cut {
      public c(bsr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxh $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cpr $$0, cxh $$1) {
         Optional<jr<czc>> $$2 = $$1.a(kv.R, cze.a).e();
         if ($$2.isPresent() && $$0 instanceof are $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cxh $$0) {
         return $$0.a(cxl.tk) || $$0.a(cxl.wq) || $$0.a(cxl.wt) || $$0.a(cxl.tj);
      }

      @Override
      public aku b() {
         return ctd.n;
      }
   }
}
