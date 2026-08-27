import com.mojang.datafixers.util.Pair;

public class cjk extends cjw<ciz> {
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
   public static final ahh v = new ahh("textures/atlas/blocks.png");
   public static final ahh w = new ahh("item/empty_armor_slot_helmet");
   public static final ahh x = new ahh("item/empty_armor_slot_chestplate");
   public static final ahh y = new ahh("item/empty_armor_slot_leggings");
   public static final ahh z = new ahh("item/empty_armor_slot_boots");
   public static final ahh A = new ahh("item/empty_armor_slot_shield");
   static final ahh[] C = new ahh[]{z, y, x, w};
   private static final bmd[] D = new bmd[]{bmd.f, bmd.e, bmd.d, bmd.c};
   private final ciz E = new ckj(this, 2, 2);
   private final cjz F = new cjz();
   public final boolean B;
   private final cfq G;

   public cjk(cfp $$0, boolean $$1, final cfq $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cka($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cke(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bmd $$6 = D[$$5];
         this.a(new cke($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cng $$0, cng $$1) {
               cjk.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cng $$0) {
               return $$6 == bmq.h($$0);
            }

            @Override
            public boolean a(cfq $$0) {
               cng $$1 = this.g();
               return !$$1.b() && !$$0.f() && crt.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<ahh, ahh> c() {
               return Pair.of(cjk.v, cjk.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cke($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cke($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cke($$0, 40, 77, 62) {
         @Override
         public void a(cng $$0, cng $$1) {
            cjk.a($$2, bmd.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ahh, ahh> c() {
            return Pair.of(cjk.v, cjk.A);
         }
      });
   }

   static void a(cfq $$0, bmd $$1, cng $$2, cng $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cfu $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cqm<? extends cqk<ciz>> $$0) {
      return $$0.b().a(this.E, this.G.dL());
   }

   @Override
   public void a(bjv $$0) {
      cja.a(this, this.G.dL(), this.G, this.E, this.F);
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dL().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return true;
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         bmd $$5 = bmq.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cng.f;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cng.f;
            }
         } else if ($$5.a() == bmd.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cng.f;
            }
         } else if ($$5 == bmd.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cng.f;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cng.f;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cng.f;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.a(cng.f, $$2);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cng $$0, cke $$1) {
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

   public ciz q() {
      return this.E;
   }

   @Override
   public cjx t() {
      return cjx.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
