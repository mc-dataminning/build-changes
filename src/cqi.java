import com.mojang.datafixers.util.Pair;

public class cqi extends cqw<cpw> {
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
   public static final akt x = new akt("textures/atlas/blocks.png");
   public static final akt y = new akt("item/empty_armor_slot_helmet");
   public static final akt z = new akt("item/empty_armor_slot_chestplate");
   public static final akt A = new akt("item/empty_armor_slot_leggings");
   public static final akt B = new akt("item/empty_armor_slot_boots");
   public static final akt C = new akt("item/empty_armor_slot_shield");
   static final akt[] E = new akt[]{B, A, z, y};
   private static final bsc[] F = new bsc[]{bsc.f, bsc.e, bsc.d, bsc.c};
   private final cpw G = new crl(this, 2, 2);
   private final cqz H = new cqz();
   public final boolean D;
   private final cly I;

   public cqi(clx $$0, boolean $$1, final cly $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new cra($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cre(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bsc $$6 = F[$$5];
         this.a(new cre($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cuh $$0, cuh $$1) {
               cqi.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return $$6 == bsc.c ? 64 : 1;
            }

            @Override
            public boolean a(cuh $$0) {
               return $$6 == bsq.h($$0);
            }

            @Override
            public boolean a(cly $$0) {
               cuh $$1 = this.g();
               return !$$1.d() && !$$0.f() && dae.f($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<akt, akt> c() {
               return Pair.of(cqi.x, cqi.E[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cre($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cre($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cre($$0, 40, 77, 62) {
         @Override
         public void a(cuh $$0, cuh $$1) {
            cqi.a($$2, bsc.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akt, akt> c() {
            return Pair.of(cqi.x, cqi.C);
         }
      });
   }

   static void a(cly $$0, bsc $$1, cuh $$2, cuh $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cmc $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(czc<? extends cza<cpw>> $$0) {
      return $$0.b().a(this.G, this.I.dU());
   }

   @Override
   public void a(bpt $$0) {
      cpx.a(this, this.I.dU(), this.I, this.G, this.H);
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.H.a();
      if (!$$0.dU().C) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         bsc $$5 = bsq.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cuh.i;
            }
         } else if ($$5.a() == bsc.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cuh.i;
            }
         } else if ($$5 == bsc.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cuh.i;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.a(cuh.i, $$2);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuh $$0, cre $$1) {
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

   public cpw q() {
      return this.G;
   }

   @Override
   public cqx t() {
      return cqx.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
