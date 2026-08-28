import java.util.Optional;

public class cvm extends cvf {
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
   private final cvr z;
   private final cxc A;

   public cvm(int $$0, crl $$1) {
      this($$0, $$1, new bun(5), new cxb(2));
   }

   public cvm(int $$0, crl $$1, btz $$2, cvr $$3) {
      super(cwo.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      dbi $$4 = $$1.h.dU().L();
      this.a(new cvm.c($$2, 0, 56, 51));
      this.a(new cvm.c($$2, 1, 79, 58));
      this.a(new cvm.c($$2, 2, 102, 51));
      this.A = this.a(new cvm.b($$4, $$2, 3, 79, 17));
      this.a(new cvm.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(crm $$0) {
      return this.y.a($$0);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cvm.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return czn.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return czn.k;
               }
            } else if (cvm.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return czn.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return czn.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return czn.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return czn.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
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

   static class a extends cxc {
      public a(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czn $$0) {
         return b($$0);
      }

      public static boolean b(czn $$0) {
         return $$0.a(axk.X);
      }

      @Override
      public alg c() {
         return cvm.m;
      }
   }

   static class b extends cxc {
      private final dbi a;

      public b(dbi $$0, btz $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(czn $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cxc {
      public c(btz $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(czn $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(crm $$0, czn $$1) {
         Optional<jf<dbh>> $$2 = $$1.a(kk.R, dbj.a).e();
         if ($$2.isPresent() && $$0 instanceof arr $$3) {
            aq.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(czn $$0) {
         return $$0.a(czr.tt) || $$0.a(czr.wz) || $$0.a(czr.wC) || $$0.a(czr.ts);
      }

      @Override
      public alg c() {
         return cvm.n;
      }
   }
}
