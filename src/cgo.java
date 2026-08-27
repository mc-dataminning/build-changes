import com.mojang.datafixers.util.Pair;

public class cgo extends cgz<cgd> {
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
   public static final afw v = new afw("textures/atlas/blocks.png");
   public static final afw w = new afw("item/empty_armor_slot_helmet");
   public static final afw x = new afw("item/empty_armor_slot_chestplate");
   public static final afw y = new afw("item/empty_armor_slot_leggings");
   public static final afw z = new afw("item/empty_armor_slot_boots");
   public static final afw A = new afw("item/empty_armor_slot_shield");
   static final afw[] C = new afw[]{z, y, x, w};
   private static final bjy[] D = new bjy[]{bjy.f, bjy.e, bjy.d, bjy.c};
   private final cgd E = new chm(this, 2, 2);
   private final chc F = new chc();
   public final boolean B;
   private final ccx G;

   public cgo(ccw $$0, boolean $$1, final ccx $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new chd($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new chh(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bjy $$6 = D[$$5];
         this.a(new chh($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(ckj $$0, ckj $$1) {
               cgo.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(ckj $$0) {
               return $$6 == bkl.h($$0);
            }

            @Override
            public boolean a(ccx $$0) {
               ckj $$1 = this.e();
               return !$$1.b() && !$$0.f() && cov.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<afw, afw> b() {
               return Pair.of(cgo.v, cgo.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new chh($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new chh($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new chh($$0, 40, 77, 62) {
         @Override
         public void a(ckj $$0, ckj $$1) {
            cgo.a($$2, bjy.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<afw, afw> b() {
            return Pair.of(cgo.v, cgo.A);
         }
      });
   }

   static void a(ccx $$0, bjy $$1, ckj $$2, ckj $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cdb $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cno<? extends cnn<cgd>> $$0) {
      return $$0.b().a(this.E, this.G.dL());
   }

   @Override
   public void a(bhu $$0) {
      cge.a(this, this.G.dL(), this.G, this.E, this.F);
   }

   @Override
   public void b(ccx $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dL().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return true;
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3.f()) {
         ckj $$4 = $$3.e();
         $$2 = $$4.p();
         bjy $$5 = bkl.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return ckj.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return ckj.b;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return ckj.b;
            }
         } else if ($$5.a() == bjy.a.b && !this.i.get(8 - $$5.b()).f()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return ckj.b;
            }
         } else if ($$5 == bjy.b && !this.i.get(45).f()) {
            if (!this.a($$4, 45, 46, false)) {
               return ckj.b;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return ckj.b;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return ckj.b;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return ckj.b;
         }

         if ($$4.b()) {
            $$3.a(ckj.b, $$2);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ckj.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ckj $$0, chh $$1) {
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

   public cgd q() {
      return this.E;
   }

   @Override
   public cha t() {
      return cha.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
