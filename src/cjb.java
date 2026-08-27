import com.mojang.datafixers.util.Pair;

public class cjb extends cjn<ciq> {
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
   public static final ahg v = new ahg("textures/atlas/blocks.png");
   public static final ahg w = new ahg("item/empty_armor_slot_helmet");
   public static final ahg x = new ahg("item/empty_armor_slot_chestplate");
   public static final ahg y = new ahg("item/empty_armor_slot_leggings");
   public static final ahg z = new ahg("item/empty_armor_slot_boots");
   public static final ahg A = new ahg("item/empty_armor_slot_shield");
   static final ahg[] C = new ahg[]{z, y, x, w};
   private static final blz[] D = new blz[]{blz.f, blz.e, blz.d, blz.c};
   private final ciq E = new cka(this, 2, 2);
   private final cjq F = new cjq();
   public final boolean B;
   private final cfh G;

   public cjb(cfg $$0, boolean $$1, final cfh $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cjr($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cjv(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final blz $$6 = D[$$5];
         this.a(new cjv($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cmx $$0, cmx $$1) {
               cjb.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cmx $$0) {
               return $$6 == bmm.h($$0);
            }

            @Override
            public boolean a(cfh $$0) {
               cmx $$1 = this.g();
               return !$$1.b() && !$$0.f() && crk.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<ahg, ahg> c() {
               return Pair.of(cjb.v, cjb.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cjv($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cjv($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cjv($$0, 40, 77, 62) {
         @Override
         public void a(cmx $$0, cmx $$1) {
            cjb.a($$2, blz.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ahg, ahg> c() {
            return Pair.of(cjb.v, cjb.A);
         }
      });
   }

   static void a(cfh $$0, blz $$1, cmx $$2, cmx $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cfl $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cqd<? extends cqb<ciq>> $$0) {
      return $$0.b().a(this.E, this.G.dM());
   }

   @Override
   public void a(bjt $$0) {
      cir.a(this, this.G.dM(), this.G, this.E, this.F);
   }

   @Override
   public void b(cfh $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dM().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return true;
   }

   @Override
   public cmx a(cfh $$0, int $$1) {
      cmx $$2 = cmx.f;
      cjv $$3 = this.i.get($$1);
      if ($$3.h()) {
         cmx $$4 = $$3.g();
         $$2 = $$4.p();
         blz $$5 = bmm.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cmx.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cmx.f;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cmx.f;
            }
         } else if ($$5.a() == blz.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cmx.f;
            }
         } else if ($$5 == blz.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cmx.f;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cmx.f;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cmx.f;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cmx.f;
         }

         if ($$4.b()) {
            $$3.a(cmx.f, $$2);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmx.f;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cmx $$0, cjv $$1) {
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

   public ciq q() {
      return this.E;
   }

   @Override
   public cjo t() {
      return cjo.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
