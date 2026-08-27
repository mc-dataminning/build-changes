import com.mojang.datafixers.util.Pair;

public class chs extends cie<chh> {
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
   public static final agm v = new agm("textures/atlas/blocks.png");
   public static final agm w = new agm("item/empty_armor_slot_helmet");
   public static final agm x = new agm("item/empty_armor_slot_chestplate");
   public static final agm y = new agm("item/empty_armor_slot_leggings");
   public static final agm z = new agm("item/empty_armor_slot_boots");
   public static final agm A = new agm("item/empty_armor_slot_shield");
   static final agm[] C = new agm[]{z, y, x, w};
   private static final bla[] D = new bla[]{bla.f, bla.e, bla.d, bla.c};
   private final chh E = new cir(this, 2, 2);
   private final cih F = new cih();
   public final boolean B;
   private final cdz G;

   public chs(cdy $$0, boolean $$1, final cdz $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cii($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cim(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bla $$6 = D[$$5];
         this.a(new cim($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(clo $$0, clo $$1) {
               chs.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(clo $$0) {
               return $$6 == bln.h($$0);
            }

            @Override
            public boolean a(cdz $$0) {
               clo $$1 = this.f();
               return !$$1.b() && !$$0.f() && cqb.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<agm, agm> c() {
               return Pair.of(chs.v, chs.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cim($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cim($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cim($$0, 40, 77, 62) {
         @Override
         public void a(clo $$0, clo $$1) {
            chs.a($$2, bla.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<agm, agm> c() {
            return Pair.of(chs.v, chs.A);
         }
      });
   }

   static void a(cdz $$0, bla $$1, clo $$2, clo $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(ced $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cov<? extends cot<chh>> $$0) {
      return $$0.b().a(this.E, this.G.dN());
   }

   @Override
   public void a(biu $$0) {
      chi.a(this, this.G.dN(), this.G, this.E, this.F);
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dN().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return true;
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         bla $$5 = bln.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return clo.b;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return clo.b;
            }
         } else if ($$5.a() == bla.a.b && !this.i.get(8 - $$5.b()).g()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return clo.b;
            }
         } else if ($$5 == bla.b && !this.i.get(45).g()) {
            if (!this.a($$4, 45, 46, false)) {
               return clo.b;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return clo.b;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return clo.b;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.a(clo.b, $$2);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(clo $$0, cim $$1) {
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

   public chh q() {
      return this.E;
   }

   @Override
   public cif t() {
      return cif.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
