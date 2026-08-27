import com.mojang.datafixers.util.Pair;

public class cmp extends cnb<cme> {
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
   public static final ajh v = new ajh("textures/atlas/blocks.png");
   public static final ajh w = new ajh("item/empty_armor_slot_helmet");
   public static final ajh x = new ajh("item/empty_armor_slot_chestplate");
   public static final ajh y = new ajh("item/empty_armor_slot_leggings");
   public static final ajh z = new ajh("item/empty_armor_slot_boots");
   public static final ajh A = new ajh("item/empty_armor_slot_shield");
   static final ajh[] C = new ajh[]{z, y, x, w};
   private static final bpd[] D = new bpd[]{bpd.f, bpd.e, bpd.d, bpd.c};
   private final cme E = new cno(this, 2, 2);
   private final cne F = new cne();
   public final boolean B;
   private final cis G;

   public cmp(cir $$0, boolean $$1, final cis $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cnf($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cnj(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bpd $$6 = D[$$5];
         this.a(new cnj($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cqk $$0, cqk $$1) {
               cmp.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cqk $$0) {
               return $$6 == bpq.h($$0);
            }

            @Override
            public boolean a(cis $$0) {
               cqk $$1 = this.g();
               return !$$1.b() && !$$0.f() && cuv.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<ajh, ajh> c() {
               return Pair.of(cmp.v, cmp.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cnj($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cnj($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cnj($$0, 40, 77, 62) {
         @Override
         public void a(cqk $$0, cqk $$1) {
            cmp.a($$2, bpd.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ajh, ajh> c() {
            return Pair.of(cmp.v, cmp.A);
         }
      });
   }

   static void a(cis $$0, bpd $$1, cqk $$2, cqk $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(ciw $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(ctp<? extends ctn<cme>> $$0) {
      return $$0.b().a(this.E, this.G.dM());
   }

   @Override
   public void a(bmv $$0) {
      cmf.a(this, this.G.dM(), this.G, this.E, this.F);
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dM().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cis $$0) {
      return true;
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         bpd $$5 = bpq.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cqk.h;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cqk.h;
            }
         } else if ($$5.a() == bpd.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cqk.h;
            }
         } else if ($$5 == bpd.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cqk.h;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cqk.h;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cqk.h;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.a(cqk.h, $$2);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cqk $$0, cnj $$1) {
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

   public cme q() {
      return this.E;
   }

   @Override
   public cnc t() {
      return cnc.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
