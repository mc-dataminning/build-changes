import com.mojang.datafixers.util.Pair;

public class chf extends chr<cgu> {
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
   public static final agg v = new agg("textures/atlas/blocks.png");
   public static final agg w = new agg("item/empty_armor_slot_helmet");
   public static final agg x = new agg("item/empty_armor_slot_chestplate");
   public static final agg y = new agg("item/empty_armor_slot_leggings");
   public static final agg z = new agg("item/empty_armor_slot_boots");
   public static final agg A = new agg("item/empty_armor_slot_shield");
   static final agg[] C = new agg[]{z, y, x, w};
   private static final bkn[] D = new bkn[]{bkn.f, bkn.e, bkn.d, bkn.c};
   private final cgu E = new cie(this, 2, 2);
   private final chu F = new chu();
   public final boolean B;
   private final cdm G;

   public chf(cdl $$0, boolean $$1, final cdm $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new chv($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new chz(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bkn $$6 = D[$$5];
         this.a(new chz($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(clb $$0, clb $$1) {
               chf.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(clb $$0) {
               return $$6 == bla.h($$0);
            }

            @Override
            public boolean a(cdm $$0) {
               clb $$1 = this.f();
               return !$$1.b() && !$$0.f() && cpo.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<agg, agg> c() {
               return Pair.of(chf.v, chf.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new chz($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new chz($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new chz($$0, 40, 77, 62) {
         @Override
         public void a(clb $$0, clb $$1) {
            chf.a($$2, bkn.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<agg, agg> c() {
            return Pair.of(chf.v, chf.A);
         }
      });
   }

   static void a(cdm $$0, bkn $$1, clb $$2, clb $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cdq $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(coh<? extends cof<cgu>> $$0) {
      return $$0.b().a(this.E, this.G.dL());
   }

   @Override
   public void a(bij $$0) {
      cgv.a(this, this.G.dL(), this.G, this.E, this.F);
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dL().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return true;
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         bkn $$5 = bla.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return clb.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return clb.b;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return clb.b;
            }
         } else if ($$5.a() == bkn.a.b && !this.i.get(8 - $$5.b()).g()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return clb.b;
            }
         } else if ($$5 == bkn.b && !this.i.get(45).g()) {
            if (!this.a($$4, 45, 46, false)) {
               return clb.b;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return clb.b;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return clb.b;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.a(clb.b, $$2);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(clb $$0, chz $$1) {
      return $$1.d != this.F && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.E.ax_();
   }

   @Override
   public int o() {
      return this.E.ay_();
   }

   @Override
   public int p() {
      return 5;
   }

   public cgu q() {
      return this.E;
   }

   @Override
   public chs t() {
      return chs.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
