import java.util.List;
import java.util.Map;

public class cwt extends cvr {
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
   public static final ali B = ali.b("container/slot/helmet");
   public static final ali C = ali.b("container/slot/chestplate");
   public static final ali D = ali.b("container/slot/leggings");
   public static final ali E = ali.b("container/slot/boots");
   public static final ali F = ali.b("container/slot/shield");
   private static final Map<bxd, ali> J = Map.of(bxd.c, E, bxd.d, D, bxd.e, C, bxd.f, B);
   private static final bxd[] K = new bxd[]{bxd.f, bxd.e, bxd.d, bxd.c};
   public final boolean G;
   private final crx L;

   public cwt(crw $$0, boolean $$1, final crx $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bxd $$4 = K[$$3];
         ali $$5 = J.get($$4);
         this.a(new cvu($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cxn($$0, 40, 77, 62) {
         @Override
         public void a(czy $$0, czy $$1) {
            $$2.a(bxd.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public ali c() {
            return cwt.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(buk $$0) {
      if (this.L.dV() instanceof ars $$1) {
         cwj.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(crx $$0) {
      return true;
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         bxd $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return czy.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return czy.k;
            }
         } else if ($$5.a() == bxd.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return czy.k;
            }
         } else if ($$5 == bxd.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return czy.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return czy.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return czy.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.a(czy.k, $$2);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(czy $$0, cxn $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cxn m() {
      return this.k.get(0);
   }

   @Override
   public List<cxn> n() {
      return this.k.subList(1, 5);
   }

   public cwi r() {
      return this.m;
   }

   @Override
   public cxg an_() {
      return cxg.a;
   }

   @Override
   protected crx q() {
      return this.L;
   }
}
