import com.mojang.datafixers.util.Pair;

public class clc extends clo<ckr> {
   public static final int k = 0;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 5;
   public static final int o = 5;
   public static final int p = 9;
   public static final int q = 9;
   public static final int r = 36;
   public static final int s = 36;
   public static final int t = 45;
   public static final int u = 45;
   public static final aiy v = new aiy("textures/atlas/blocks.png");
   public static final aiy w = new aiy("item/empty_armor_slot_helmet");
   public static final aiy x = new aiy("item/empty_armor_slot_chestplate");
   public static final aiy y = new aiy("item/empty_armor_slot_leggings");
   public static final aiy z = new aiy("item/empty_armor_slot_boots");
   public static final aiy A = new aiy("item/empty_armor_slot_shield");
   static final aiy[] C = new aiy[]{z, y, x, w};
   private static final bnv[] D = new bnv[]{bnv.f, bnv.e, bnv.d, bnv.c};
   private final ckr E = new cmb(this, 2, 2);
   private final clr F = new clr();
   public final boolean B;
   private final chh G;

   public clc(chg $$0, boolean $$1, final chh $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cls($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new clw(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bnv $$6 = D[$$5];
         this.a(new clw($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(coz $$0, coz $$1) {
               clc.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(coz $$0) {
               return $$6 == boi.h($$0);
            }

            @Override
            public boolean a(chh $$0) {
               coz $$1 = this.g();
               return !$$1.b() && !$$0.f() && ctj.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<aiy, aiy> c() {
               return Pair.of(clc.v, clc.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new clw($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new clw($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new clw($$0, 40, 77, 62) {
         @Override
         public void a(coz $$0, coz $$1) {
            clc.a($$2, bnv.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<aiy, aiy> c() {
            return Pair.of(clc.v, clc.A);
         }
      });
   }

   static void a(chh $$0, bnv $$1, coz $$2, coz $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(chl $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(csd<? extends csb<ckr>> $$0) {
      return $$0.b().a(this.E, this.G.dM());
   }

   @Override
   public void a(bln $$0) {
      cks.a(this, this.G.dM(), this.G, this.E, this.F);
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dM().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(chh $$0) {
      return true;
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         bnv $$5 = boi.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return coz.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return coz.h;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return coz.h;
            }
         } else if ($$5.a() == bnv.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return coz.h;
            }
         } else if ($$5 == bnv.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return coz.h;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return coz.h;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return coz.h;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return coz.h;
         }

         if ($$4.b()) {
            $$3.a(coz.h, $$2);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return coz.h;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(coz $$0, clw $$1) {
      return $$1.d != this.F && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.E.f();
   }

   @Override
   public int o() {
      return this.E.g();
   }

   @Override
   public int p() {
      return 5;
   }

   public ckr q() {
      return this.E;
   }

   @Override
   public clp t() {
      return clp.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
