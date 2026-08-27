import com.mojang.datafixers.util.Pair;

public class cnx extends coj<cnm> {
   public static final int k = 0;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 4;
   public static final int o = 5;
   public static final int p = 5;
   public static final int q = 4;
   public static final int r = 9;
   public static final int s = 9;
   public static final int t = 36;
   public static final int u = 36;
   public static final int v = 45;
   public static final int w = 45;
   public static final ajv x = new ajv("textures/atlas/blocks.png");
   public static final ajv y = new ajv("item/empty_armor_slot_helmet");
   public static final ajv z = new ajv("item/empty_armor_slot_chestplate");
   public static final ajv A = new ajv("item/empty_armor_slot_leggings");
   public static final ajv B = new ajv("item/empty_armor_slot_boots");
   public static final ajv C = new ajv("item/empty_armor_slot_shield");
   static final ajv[] E = new ajv[]{B, A, z, y};
   private static final bqh[] F = new bqh[]{bqh.f, bqh.e, bqh.d, bqh.c};
   private final cnm G = new coz(this, 2, 2);
   private final com H = new com();
   public final boolean D;
   private final cka I;

   public cnx(cjz $$0, boolean $$1, final cka $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new coo($$0.m, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cos(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bqh $$6 = F[$$5];
         this.a(new cos($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(crs $$0, crs $$1) {
               cnx.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(crs $$0) {
               return $$6 == bqv.h($$0);
            }

            @Override
            public boolean a(cka $$0) {
               crs $$1 = this.g();
               return !$$1.d() && !$$0.f() && cxa.f($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<ajv, ajv> c() {
               return Pair.of(cnx.x, cnx.E[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cos($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cos($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cos($$0, 40, 77, 62) {
         @Override
         public void a(crs $$0, crs $$1) {
            cnx.a($$2, bqh.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ajv, ajv> c() {
            return Pair.of(cnx.x, cnx.C);
         }
      });
   }

   static void a(cka $$0, bqh $$1, crs $$2, crs $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cke $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(cvu<? extends cvs<cnm>> $$0) {
      return $$0.b().a(this.G, this.I.dM());
   }

   @Override
   public void a(bny $$0) {
      cnn.a(this, this.I.dM(), this.I, this.G, this.H);
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.H.a();
      if (!$$0.dM().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean a(cka $$0) {
      return true;
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         bqh $$5 = bqv.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return crs.i;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return crs.i;
            }
         } else if ($$5.a() == bqh.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return crs.i;
            }
         } else if ($$5 == bqh.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return crs.i;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return crs.i;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return crs.i;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.a(crs.i, $$2);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(crs $$0, cos $$1) {
      return $$1.d != this.H && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.G.f();
   }

   @Override
   public int o() {
      return this.G.g();
   }

   @Override
   public int p() {
      return 5;
   }

   public cnm q() {
      return this.G;
   }

   @Override
   public cok t() {
      return cok.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
