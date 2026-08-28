import java.util.List;
import java.util.Map;

public class cwi extends cvg {
   public static final int o = 0;
   public static final int p = 0;
   private static final int H = 2;
   private static final int I = 2;
   public static final int q = 1;
   public static final int r = 4;
   public static final int s = 5;
   public static final int t = 5;
   public static final int u = 4;
   public static final int v = 9;
   public static final int w = 9;
   public static final int x = 36;
   public static final int y = 36;
   public static final int z = 45;
   public static final int A = 45;
   public static final alg B = alg.b("container/slot/helmet");
   public static final alg C = alg.b("container/slot/chestplate");
   public static final alg D = alg.b("container/slot/leggings");
   public static final alg E = alg.b("container/slot/boots");
   public static final alg F = alg.b("container/slot/shield");
   private static final Map<bws, alg> J = Map.of(bws.c, E, bws.d, D, bws.e, C, bws.f, B);
   private static final bws[] K = new bws[]{bws.f, bws.e, bws.d, bws.c};
   public final boolean G;
   private final crm L;

   public cwi(crl $$0, boolean $$1, final crm $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bws $$4 = K[$$3];
         alg $$5 = J.get($$4);
         this.a(new cvj($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cxc($$0, 40, 77, 62) {
         @Override
         public void a(czn $$0, czn $$1) {
            $$2.a(bws.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public alg c() {
            return cwi.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(btz $$0) {
      if (this.L.dU() instanceof arq $$1) {
         cvy.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(crm $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dU().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(crm $$0) {
      return true;
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3.h()) {
         czn $$4 = $$3.g();
         $$2 = $$4.v();
         bws $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return czn.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return czn.k;
            }
         } else if ($$5.a() == bws.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return czn.k;
            }
         } else if ($$5 == bws.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return czn.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return czn.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return czn.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.a(czn.k, $$2);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czn.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(czn $$0, cxc $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cxc m() {
      return this.k.get(0);
   }

   @Override
   public List<cxc> n() {
      return this.k.subList(1, 5);
   }

   public cvx r() {
      return this.m;
   }

   @Override
   public cwv aj_() {
      return cwv.a;
   }

   @Override
   protected crm q() {
      return this.L;
   }
}
