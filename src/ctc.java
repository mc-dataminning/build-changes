import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class ctc extends csa {
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
   public static final alj B = alj.b("textures/atlas/blocks.png");
   public static final alj C = alj.b("item/empty_armor_slot_helmet");
   public static final alj D = alj.b("item/empty_armor_slot_chestplate");
   public static final alj E = alj.b("item/empty_armor_slot_leggings");
   public static final alj F = alj.b("item/empty_armor_slot_boots");
   public static final alj G = alj.b("item/empty_armor_slot_shield");
   private static final Map<but, alj> K = Map.of(but.c, F, but.d, E, but.e, D, but.f, C);
   private static final but[] L = new but[]{but.f, but.e, but.d, but.c};
   public final boolean H;
   private final cou M;

   public ctc(cot $$0, boolean $$1, final cou $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         but $$4 = L[$$3];
         alj $$5 = K.get($$4);
         this.a(new csd($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new ctw($$0, 40, 77, 62) {
         @Override
         public void a(cwm $$0, cwm $$1) {
            $$2.a(but.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<alj, alj> b() {
            return Pair.of(ctc.B, ctc.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bsd $$0) {
      css.a(this, this.M.dV(), this.M, this.m, this.n, null);
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cou $$0) {
      return true;
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         but $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cwm.k;
            }
         } else if ($$5.a() == but.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cwm.k;
            }
         } else if ($$5 == but.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cwm.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.a(cwm.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwm $$0, ctw $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctw m() {
      return this.k.get(0);
   }

   @Override
   public List<ctw> n() {
      return this.k.subList(1, 5);
   }

   public csr r() {
      return this.m;
   }

   @Override
   public ctp am_() {
      return ctp.a;
   }

   @Override
   protected cou q() {
      return this.M;
   }
}
