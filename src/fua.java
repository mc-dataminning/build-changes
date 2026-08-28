public class fua<T extends cgj> extends fuz<T> {
   private static final float a = 2.0F;
   private static final float b = 2.5F;
   private static final float f = 0.45F;
   private static final float g = 29.35F;
   private static final String h = "saddle";
   private static final String i = "bridle";
   private static final String j = "reins";
   private final fxq k;
   private final fxq l;
   private final fxq[] m;
   private final fxq[] n;

   public fua(fxq $$0) {
      this.k = $$0;
      fxq $$1 = $$0.b("body");
      this.l = $$1.b("head");
      this.m = new fxq[]{$$1.b("saddle"), this.l.b("bridle")};
      this.n = new fxq[]{this.l.b("reins")};
   }

   public static fxw b() {
      fxy $$0 = new fxy();
      fxz $$1 = $$0.a();
      fxu $$2 = new fxu(0.05F);
      fxz $$3 = $$1.a("body", fxv.c().a(0, 25).a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F), fxs.a(0.0F, 4.0F, 9.5F));
      $$3.a("hump", fxv.c().a(74, 0).a(-4.5F, -5.0F, -5.5F, 9.0F, 5.0F, 11.0F), fxs.a(0.0F, -12.0F, -10.0F));
      $$3.a("tail", fxv.c().a(122, 0).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 0.0F), fxs.a(0.0F, -9.0F, 3.5F));
      fxz $$4 = $$3.a(
         "head",
         fxv.c()
            .a(60, 24)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F)
            .a(21, 0)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F)
            .a(50, 0)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F),
         fxs.a(0.0F, -3.0F, -19.5F)
      );
      $$4.a("left_ear", fxv.c().a(45, 0).a(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), fxs.a(2.5F, -21.0F, -9.5F));
      $$4.a("right_ear", fxv.c().a(67, 0).a(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F), fxs.a(-2.5F, -21.0F, -9.5F));
      $$1.a("left_hind_leg", fxv.c().a(58, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fxs.a(4.9F, 1.0F, 9.5F));
      $$1.a("right_hind_leg", fxv.c().a(94, 16).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fxs.a(-4.9F, 1.0F, 9.5F));
      $$1.a("left_front_leg", fxv.c().a(0, 0).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fxs.a(4.9F, 1.0F, -10.5F));
      $$1.a("right_front_leg", fxv.c().a(0, 26).a(-2.5F, 2.0F, -2.5F, 5.0F, 21.0F, 5.0F), fxs.a(-4.9F, 1.0F, -10.5F));
      $$3.a(
         "saddle",
         fxv.c()
            .a(74, 64)
            .a(-4.5F, -17.0F, -15.5F, 9.0F, 5.0F, 11.0F, $$2)
            .a(92, 114)
            .a(-3.5F, -20.0F, -15.5F, 7.0F, 3.0F, 11.0F, $$2)
            .a(0, 89)
            .a(-7.5F, -12.0F, -23.5F, 15.0F, 12.0F, 27.0F, $$2),
         fxs.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "reins",
         fxv.c()
            .a(98, 42)
            .a(3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F)
            .a(84, 57)
            .a(-3.5F, -18.0F, -2.0F, 7.0F, 7.0F, 0.0F)
            .a(98, 42)
            .a(-3.51F, -18.0F, -17.0F, 0.0F, 7.0F, 15.0F),
         fxs.a(0.0F, 0.0F, 0.0F)
      );
      $$4.a(
         "bridle",
         fxv.c()
            .a(60, 87)
            .a(-3.5F, -7.0F, -15.0F, 7.0F, 8.0F, 19.0F, $$2)
            .a(21, 64)
            .a(-3.5F, -21.0F, -15.0F, 7.0F, 14.0F, 7.0F, $$2)
            .a(50, 64)
            .a(-2.5F, -21.0F, -21.0F, 5.0F, 5.0F, 6.0F, $$2)
            .a(74, 70)
            .a(2.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F)
            .a(74, 70)
            .a()
            .a(-3.5F, -19.0F, -18.0F, 1.0F, 2.0F, 2.0F),
         fxs.a(0.0F, 0.0F, 0.0F)
      );
      return fxw.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxq::c);
      this.a($$0, $$4, $$5, $$3);
      this.a($$0);
      this.a(fgr.a, $$1, $$2, 2.0F, 2.5F);
      this.a($$0.cg, fgr.b, $$3, 1.0F);
      this.a($$0.ch, fgr.c, $$3, 1.0F);
      this.a($$0.ci, fgr.d, $$3, 1.0F);
      this.a($$0.cj, fgr.f, $$3, 1.0F);
      this.a($$0.ck, fgr.e, $$3, 1.0F);
   }

   private void a(T $$0, float $$1, float $$2, float $$3) {
      $$1 = ayg.a($$1, -30.0F, 30.0F);
      $$2 = ayg.a($$2, -25.0F, 45.0F);
      if ($$0.c() > 0) {
         float $$4 = $$3 - (float)$$0.ai;
         float $$5 = 45.0F * ((float)$$0.c() - $$4) / 55.0F;
         $$2 = ayg.a($$2 + $$5, -25.0F, 70.0F);
      }

      this.l.f = $$1 * (float) (Math.PI / 180.0);
      this.l.e = $$2 * (float) (Math.PI / 180.0);
   }

   private void a(T $$0) {
      boolean $$1 = $$0.i();
      boolean $$2 = $$0.bU();

      for (fxq $$3 : this.m) {
         $$3.k = $$1;
      }

      for (fxq $$4 : this.n) {
         $$4.k = $$2 && $$1;
      }
   }

   @Override
   public void a(fao $$0, fas $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.e) {
         $$0.a();
         $$0.b(0.45F, 0.45F, 0.45F);
         $$0.a(0.0F, 1.834375F, 0.0F);
         this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$0.b();
      } else {
         this.a().a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public fxq a() {
      return this.k;
   }
}
