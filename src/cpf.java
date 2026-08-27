import com.mojang.datafixers.util.Pair;

public class cpf extends cpr<cou> {
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
   public static final akh x = new akh("textures/atlas/blocks.png");
   public static final akh y = new akh("item/empty_armor_slot_helmet");
   public static final akh z = new akh("item/empty_armor_slot_chestplate");
   public static final akh A = new akh("item/empty_armor_slot_leggings");
   public static final akh B = new akh("item/empty_armor_slot_boots");
   public static final akh C = new akh("item/empty_armor_slot_shield");
   static final akh[] E = new akh[]{B, A, z, y};
   private static final bro[] F = new bro[]{bro.f, bro.e, bro.d, bro.c};
   private final cou G = new cqg(this, 2, 2);
   private final cpu H = new cpu();
   public final boolean D;
   private final clh I;

   public cpf(clg $$0, boolean $$1, final clh $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new cpv($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cpz(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bro $$6 = F[$$5];
         this.a(new cpz($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(csz $$0, csz $$1) {
               cpf.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(csz $$0) {
               return $$6 == bsc.h($$0);
            }

            @Override
            public boolean a(clh $$0) {
               csz $$1 = this.g();
               return !$$1.d() && !$$0.f() && cyh.f($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<akh, akh> c() {
               return Pair.of(cpf.x, cpf.E[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cpz($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cpz($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cpz($$0, 40, 77, 62) {
         @Override
         public void a(csz $$0, csz $$1) {
            cpf.a($$2, bro.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akh, akh> c() {
            return Pair.of(cpf.x, cpf.C);
         }
      });
   }

   static void a(clh $$0, bro $$1, csz $$2, csz $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cll $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(cxf<? extends cxd<cou>> $$0) {
      return $$0.b().a(this.G, this.I.dN());
   }

   @Override
   public void a(bpf $$0) {
      cov.a(this, this.I.dN(), this.I, this.G, this.H);
   }

   @Override
   public void b(clh $$0) {
      super.b($$0);
      this.H.a();
      if (!$$0.dN().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean a(clh $$0) {
      return true;
   }

   @Override
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         bro $$5 = bsc.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return csz.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return csz.i;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return csz.i;
            }
         } else if ($$5.a() == bro.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return csz.i;
            }
         } else if ($$5 == bro.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return csz.i;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return csz.i;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return csz.i;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.a(csz.i, $$2);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(csz $$0, cpz $$1) {
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

   public cou q() {
      return this.G;
   }

   @Override
   public cps t() {
      return cps.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
