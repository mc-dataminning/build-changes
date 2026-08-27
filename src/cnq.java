import com.mojang.datafixers.util.Pair;

public class cnq extends coc<cnf> {
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
   public static final ajt v = new ajt("textures/atlas/blocks.png");
   public static final ajt w = new ajt("item/empty_armor_slot_helmet");
   public static final ajt x = new ajt("item/empty_armor_slot_chestplate");
   public static final ajt y = new ajt("item/empty_armor_slot_leggings");
   public static final ajt z = new ajt("item/empty_armor_slot_boots");
   public static final ajt A = new ajt("item/empty_armor_slot_shield");
   static final ajt[] C = new ajt[]{z, y, x, w};
   private static final bqc[] D = new bqc[]{bqc.f, bqc.e, bqc.d, bqc.c};
   private final cnf E = new coq(this, 2, 2);
   private final cof F = new cof();
   public final boolean B;
   private final cjt G;

   public cnq(cjs $$0, boolean $$1, final cjt $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cog($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cok(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bqc $$6 = D[$$5];
         this.a(new cok($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(crj $$0, crj $$1) {
               cnq.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(crj $$0) {
               return $$6 == bqq.h($$0);
            }

            @Override
            public boolean a(cjt $$0) {
               crj $$1 = this.g();
               return !$$1.d() && !$$0.f() && cwr.e($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<ajt, ajt> c() {
               return Pair.of(cnq.v, cnq.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cok($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cok($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cok($$0, 40, 77, 62) {
         @Override
         public void a(crj $$0, crj $$1) {
            cnq.a($$2, bqc.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ajt, ajt> c() {
            return Pair.of(cnq.v, cnq.A);
         }
      });
   }

   static void a(cjt $$0, bqc $$1, crj $$2, crj $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cjx $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cvl<? extends cvj<cnf>> $$0) {
      return $$0.b().a(this.E, this.G.dM());
   }

   @Override
   public void a(bnt $$0) {
      cng.a(this, this.G.dM(), this.G, this.E, this.F);
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dM().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return true;
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         bqc $$5 = bqq.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return crj.i;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return crj.i;
            }
         } else if ($$5.a() == bqc.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return crj.i;
            }
         } else if ($$5 == bqc.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return crj.i;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return crj.i;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.a(crj.i, $$2);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(crj $$0, cok $$1) {
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

   public cnf q() {
      return this.E;
   }

   @Override
   public cod t() {
      return cod.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
