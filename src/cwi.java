import java.util.Optional;

public class cwi extends cwb {
   static final alr m = alr.b("container/slot/brewing_fuel");
   static final alr n = alr.b("container/slot/potion");
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
   private final buv y;
   private final cwn z;
   private final cxz A;

   public cwi(int $$0, csh $$1) {
      this($$0, $$1, new bvj(5), new cxy(2));
   }

   public cwi(int $$0, csh $$1, buv $$2, cwn $$3) {
      super(cxk.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      dcf $$4 = $$1.h.dV().L();
      this.a(new cwi.c($$2, 0, 56, 51));
      this.a(new cwi.c($$2, 1, 79, 58));
      this.a(new cwi.c($$2, 2, 102, 51));
      this.A = this.a(new cwi.b($$4, $$2, 3, 79, 17));
      this.a(new cwi.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(csi $$0) {
      return this.y.a($$0);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cwi.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return dak.l;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return dak.l;
               }
            } else if (cwi.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return dak.l;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return dak.l;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return dak.l;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return dak.l;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
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

   static class a extends cxz {
      public a(buv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(dak $$0) {
         return b($$0);
      }

      public static boolean b(dak $$0) {
         return $$0.a(axv.Y);
      }

      @Override
      public alr c() {
         return cwi.m;
      }
   }

   static class b extends cxz {
      private final dcf a;

      public b(dcf $$0, buv $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(dak $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cxz {
      public c(buv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(dak $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(csi $$0, dak $$1) {
         Optional<jg<dce>> $$2 = $$1.a(kl.R, dcg.a).e();
         if ($$2.isPresent() && $$0 instanceof asc $$3) {
            aq.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(dak $$0) {
         return $$0.a(dao.tt) || $$0.a(dao.wz) || $$0.a(dao.wC) || $$0.a(dao.ts);
      }

      @Override
      public alr c() {
         return cwi.n;
      }
   }
}
