import com.mojang.datafixers.util.Pair;

public class cil extends cix<cia> {
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
   public static final agt v = new agt("textures/atlas/blocks.png");
   public static final agt w = new agt("item/empty_armor_slot_helmet");
   public static final agt x = new agt("item/empty_armor_slot_chestplate");
   public static final agt y = new agt("item/empty_armor_slot_leggings");
   public static final agt z = new agt("item/empty_armor_slot_boots");
   public static final agt A = new agt("item/empty_armor_slot_shield");
   static final agt[] C = new agt[]{z, y, x, w};
   private static final blk[] D = new blk[]{blk.f, blk.e, blk.d, blk.c};
   private final cia E = new cjk(this, 2, 2);
   private final cja F = new cja();
   public final boolean B;
   private final cer G;

   public cil(ceq $$0, boolean $$1, final cer $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cjb($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cjf(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final blk $$6 = D[$$5];
         this.a(new cjf($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cmh $$0, cmh $$1) {
               cil.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cmh $$0) {
               return $$6 == blx.h($$0);
            }

            @Override
            public boolean a(cer $$0) {
               cmh $$1 = this.g();
               return !$$1.b() && !$$0.f() && cqu.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<agt, agt> c() {
               return Pair.of(cil.v, cil.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cjf($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cjf($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cjf($$0, 40, 77, 62) {
         @Override
         public void a(cmh $$0, cmh $$1) {
            cil.a($$2, blk.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<agt, agt> c() {
            return Pair.of(cil.v, cil.A);
         }
      });
   }

   static void a(cer $$0, blk $$1, cmh $$2, cmh $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cev $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cpn<? extends cpl<cia>> $$0) {
      return $$0.b().a(this.E, this.G.dM());
   }

   @Override
   public void a(bje $$0) {
      cib.a(this, this.G.dM(), this.G, this.E, this.F);
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dM().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cer $$0) {
      return true;
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         blk $$5 = blx.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cmh.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cmh.f;
            }
         } else if ($$5.a() == blk.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cmh.f;
            }
         } else if ($$5 == blk.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cmh.f;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.a(cmh.f, $$2);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cmh $$0, cjf $$1) {
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

   public cia q() {
      return this.E;
   }

   @Override
   public ciy t() {
      return ciy.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
