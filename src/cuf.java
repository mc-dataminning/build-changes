import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class cuf extends ctd {
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
   public static final alz B = alz.b("textures/atlas/blocks.png");
   public static final alz C = alz.b("item/empty_armor_slot_helmet");
   public static final alz D = alz.b("item/empty_armor_slot_chestplate");
   public static final alz E = alz.b("item/empty_armor_slot_leggings");
   public static final alz F = alz.b("item/empty_armor_slot_boots");
   public static final alz G = alz.b("item/empty_armor_slot_shield");
   private static final Map<bvs, alz> K = Map.of(bvs.c, F, bvs.d, E, bvs.e, D, bvs.f, C);
   private static final bvs[] L = new bvs[]{bvs.f, bvs.e, bvs.d, bvs.c};
   public final boolean H;
   private final cpx M;

   public cuf(cpw $$0, boolean $$1, final cpx $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bvs $$4 = L[$$3];
         alz $$5 = K.get($$4);
         this.a(new ctg($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cuz($$0, 40, 77, 62) {
         @Override
         public void a(cxp $$0, cxp $$1) {
            $$2.a(bvs.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<alz, alz> b() {
            return Pair.of(cuf.B, cuf.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(btc $$0) {
      if (this.M.dW() instanceof ash $$1) {
         ctv.a(this, $$1, this.M, this.m, this.n, null);
      }
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dW().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cpx $$0) {
      return true;
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         bvs $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cxp.j;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cxp.j;
            }
         } else if ($$5.a() == bvs.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cxp.j;
            }
         } else if ($$5 == bvs.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cxp.j;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cxp.j;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.a(cxp.j, $$2);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxp $$0, cuz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cuz m() {
      return this.k.get(0);
   }

   @Override
   public List<cuz> n() {
      return this.k.subList(1, 5);
   }

   public ctu r() {
      return this.m;
   }

   @Override
   public cus an_() {
      return cus.a;
   }

   @Override
   protected cpx q() {
      return this.M;
   }
}
