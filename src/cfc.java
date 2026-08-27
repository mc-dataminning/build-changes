import com.mojang.datafixers.util.Pair;

public class cfc extends cfn<cer> {
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
   public static final aer v = new aer("textures/atlas/blocks.png");
   public static final aer w = new aer("item/empty_armor_slot_helmet");
   public static final aer x = new aer("item/empty_armor_slot_chestplate");
   public static final aer y = new aer("item/empty_armor_slot_leggings");
   public static final aer z = new aer("item/empty_armor_slot_boots");
   public static final aer A = new aer("item/empty_armor_slot_shield");
   static final aer[] C = new aer[]{z, y, x, w};
   private static final bin[] D = new bin[]{bin.f, bin.e, bin.d, bin.c};
   private final cer E = new cga(this, 2, 2);
   private final cfq F = new cfq();
   public final boolean B;
   private final cbm G;

   public cfc(cbl $$0, boolean $$1, final cbm $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cfr($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cfv(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bin $$6 = D[$$5];
         this.a(new cfv($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cix $$0, cix $$1) {
               cfc.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cix $$0) {
               return $$6 == bja.h($$0);
            }

            @Override
            public boolean a(cbm $$0) {
               cix $$1 = this.e();
               return !$$1.b() && !$$0.f() && cng.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<aer, aer> b() {
               return Pair.of(cfc.v, cfc.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cfv($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cfv($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cfv($$0, 40, 77, 62) {
         @Override
         public void a(cix $$0, cix $$1) {
            cfc.a($$2, bin.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<aer, aer> b() {
            return Pair.of(cfc.v, cfc.A);
         }
      });
   }

   static void a(cbm $$0, bin $$1, cix $$2, cix $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cbq $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cma<? super cer> $$0) {
      return $$0.a(this.E, this.G.dK());
   }

   @Override
   public void a(bgj $$0) {
      ces.a(this, this.G.dK(), this.G, this.E, this.F);
   }

   @Override
   public void b(cbm $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dK().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return true;
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         bin $$5 = bja.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cix.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cix.b;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cix.b;
            }
         } else if ($$5.a() == bin.a.b && !this.i.get(8 - $$5.b()).f()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cix.b;
            }
         } else if ($$5 == bin.b && !this.i.get(45).f()) {
            if (!this.a($$4, 45, 46, false)) {
               return cix.b;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cix.b;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cix.b;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cix.b;
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cix.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cix $$0, cfv $$1) {
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

   public cer q() {
      return this.E;
   }

   @Override
   public cfo t() {
      return cfo.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
