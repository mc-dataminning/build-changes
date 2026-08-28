import java.util.List;
import java.util.Map;

public class ctz extends csx {
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
   public static final aku B = aku.b("container/slot/helmet");
   public static final aku C = aku.b("container/slot/chestplate");
   public static final aku D = aku.b("container/slot/leggings");
   public static final aku E = aku.b("container/slot/boots");
   public static final aku F = aku.b("container/slot/shield");
   private static final Map<bvj, aku> J = Map.of(bvj.c, E, bvj.d, D, bvj.e, C, bvj.f, B);
   private static final bvj[] K = new bvj[]{bvj.f, bvj.e, bvj.d, bvj.c};
   public final boolean G;
   private final cpr L;

   public ctz(cpq $$0, boolean $$1, final cpr $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bvj $$4 = K[$$3];
         aku $$5 = J.get($$4);
         this.a(new cta($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cut($$0, 40, 77, 62) {
         @Override
         public void a(cxh $$0, cxh $$1) {
            $$2.a(bvj.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public aku b() {
            return ctz.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bsr $$0) {
      if (this.L.dU() instanceof ard $$1) {
         ctp.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dU().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cpr $$0) {
      return true;
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         bvj $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cxh.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cxh.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cxh.k;
            }
         } else if ($$5.a() == bvj.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cxh.k;
            }
         } else if ($$5 == bvj.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cxh.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cxh.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.a(cxh.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxh.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxh $$0, cut $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cut m() {
      return this.k.get(0);
   }

   @Override
   public List<cut> n() {
      return this.k.subList(1, 5);
   }

   public cto r() {
      return this.m;
   }

   @Override
   public cum am_() {
      return cum.a;
   }

   @Override
   protected cpr q() {
      return this.L;
   }
}
