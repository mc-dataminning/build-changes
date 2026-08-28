import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class csv extends crt {
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
   public static final all B = all.b("textures/atlas/blocks.png");
   public static final all C = all.b("item/empty_armor_slot_helmet");
   public static final all D = all.b("item/empty_armor_slot_chestplate");
   public static final all E = all.b("item/empty_armor_slot_leggings");
   public static final all F = all.b("item/empty_armor_slot_boots");
   public static final all G = all.b("item/empty_armor_slot_shield");
   private static final Map<buq, all> K = Map.of(buq.c, F, buq.d, E, buq.e, D, buq.f, C);
   private static final buq[] L = new buq[]{buq.f, buq.e, buq.d, buq.c};
   public final boolean H;
   private final cor M;

   public csv(coq $$0, boolean $$1, final cor $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         buq $$4 = L[$$3];
         all $$5 = K.get($$4);
         this.a(new crw($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new ctp($$0, 40, 77, 62) {
         @Override
         public void a(cwf $$0, cwf $$1) {
            $$2.a(buq.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<all, all> b() {
            return Pair.of(csv.B, csv.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bsa $$0) {
      csl.a(this, this.M.dY(), this.M, this.m, this.n, null);
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dY().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cor $$0) {
      return true;
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         buq $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cwf.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cwf.k;
            }
         } else if ($$5.a() == buq.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cwf.k;
            }
         } else if ($$5 == buq.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cwf.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cwf.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.a(cwf.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwf.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwf $$0, ctp $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctp m() {
      return this.k.get(0);
   }

   @Override
   public List<ctp> n() {
      return this.k.subList(1, 5);
   }

   public csk r() {
      return this.m;
   }

   @Override
   public cti ao_() {
      return cti.a;
   }

   @Override
   protected cor q() {
      return this.M;
   }
}
