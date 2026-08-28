import java.util.List;
import java.util.Map;

public class cuq extends cto {
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
   public static final ald B = ald.b("container/slot/helmet");
   public static final ald C = ald.b("container/slot/chestplate");
   public static final ald D = ald.b("container/slot/leggings");
   public static final ald E = ald.b("container/slot/boots");
   public static final ald F = ald.b("container/slot/shield");
   private static final Map<bwc, ald> J = Map.of(bwc.c, E, bwc.d, D, bwc.e, C, bwc.f, B);
   private static final bwc[] K = new bwc[]{bwc.f, bwc.e, bwc.d, bwc.c};
   public final boolean G;
   private final cqi L;

   public cuq(cqh $$0, boolean $$1, final cqi $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bwc $$4 = K[$$3];
         ald $$5 = J.get($$4);
         this.a(new ctr($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cvk($$0, 40, 77, 62) {
         @Override
         public void a(cxy $$0, cxy $$1) {
            $$2.a(bwc.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public ald c() {
            return cuq.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(btj $$0) {
      if (this.L.dV() instanceof arn $$1) {
         cug.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cqi $$0) {
      return true;
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         bwc $$5 = $$0.g($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cxy.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cxy.k;
            }
         } else if ($$5.a() == bwc.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cxy.k;
            }
         } else if ($$5 == bwc.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cxy.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cxy.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.a(cxy.k, $$2);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxy $$0, cvk $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cvk m() {
      return this.k.get(0);
   }

   @Override
   public List<cvk> n() {
      return this.k.subList(1, 5);
   }

   public cuf r() {
      return this.m;
   }

   @Override
   public cvd ai_() {
      return cvd.a;
   }

   @Override
   protected cqi q() {
      return this.L;
   }
}
