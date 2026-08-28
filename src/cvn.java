import java.util.List;
import java.util.Map;

public class cvn extends cul {
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
   public static final ale B = ale.b("container/slot/helmet");
   public static final ale C = ale.b("container/slot/chestplate");
   public static final ale D = ale.b("container/slot/leggings");
   public static final ale E = ale.b("container/slot/boots");
   public static final ale F = ale.b("container/slot/shield");
   private static final Map<bwk, ale> J = Map.of(bwk.c, E, bwk.d, D, bwk.e, C, bwk.f, B);
   private static final bwk[] K = new bwk[]{bwk.f, bwk.e, bwk.d, bwk.c};
   public final boolean G;
   private final cqs L;

   public cvn(cqr $$0, boolean $$1, final cqs $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bwk $$4 = K[$$3];
         ale $$5 = J.get($$4);
         this.a(new cuo($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cwh($$0, 40, 77, 62) {
         @Override
         public void a(cys $$0, cys $$1) {
            $$2.a(bwk.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public ale c() {
            return cvn.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(btr $$0) {
      if (this.L.dV() instanceof aro $$1) {
         cvd.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cqs $$0) {
      return true;
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         bwk $$5 = $$0.g($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cys.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cys.k;
            }
         } else if ($$5.a() == bwk.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cys.k;
            }
         } else if ($$5 == bwk.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cys.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cys.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.a(cys.k, $$2);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cys $$0, cwh $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cwh m() {
      return this.k.get(0);
   }

   @Override
   public List<cwh> n() {
      return this.k.subList(1, 5);
   }

   public cvc r() {
      return this.m;
   }

   @Override
   public cwa ai_() {
      return cwa.a;
   }

   @Override
   protected cqs q() {
      return this.L;
   }
}
