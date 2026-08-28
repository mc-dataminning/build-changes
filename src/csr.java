import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class csr extends crp {
   public static final int o = 0;
   public static final int p = 0;
   private static final int I = 2;
   private static final int J = 2;
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
   public static final ali B = ali.b("textures/atlas/blocks.png");
   public static final ali C = ali.b("item/empty_armor_slot_helmet");
   public static final ali D = ali.b("item/empty_armor_slot_chestplate");
   public static final ali E = ali.b("item/empty_armor_slot_leggings");
   public static final ali F = ali.b("item/empty_armor_slot_boots");
   public static final ali G = ali.b("item/empty_armor_slot_shield");
   private static final Map<bum, ali> K = Map.of(bum.c, F, bum.d, E, bum.e, D, bum.f, C);
   private static final bum[] L = new bum[]{bum.f, bum.e, bum.d, bum.c};
   public final boolean H;
   private final com M;

   public csr(col $$0, boolean $$1, final com $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bum $$4 = L[$$3];
         ali $$5 = K.get($$4);
         this.a(new crs($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new ctl($$0, 40, 77, 62) {
         @Override
         public void a(cwb $$0, cwb $$1) {
            $$2.a(bum.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ali, ali> b() {
            return Pair.of(csr.B, csr.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(brw $$0) {
      csh.a(this, this.M.dX(), this.M, this.m, this.n, null);
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dX().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(com $$0) {
      return true;
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         bum $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cwb.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cwb.k;
            }
         } else if ($$5.a() == bum.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cwb.k;
            }
         } else if ($$5 == bum.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cwb.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.a(cwb.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwb.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwb $$0, ctl $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctl m() {
      return this.k.get(0);
   }

   @Override
   public List<ctl> n() {
      return this.k.subList(1, 5);
   }

   public csg r() {
      return this.m;
   }

   @Override
   public cte ao_() {
      return cte.a;
   }

   @Override
   protected com q() {
      return this.M;
   }
}
