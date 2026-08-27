public class fjb<T extends byx> extends fjh<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fly g;
   private final fly h;
   private final fly i;
   private final fly j;
   private final fly k;
   private final fly l;
   private final fly m;
   private final fly n;
   private final fly o;
   private final fly p;

   public fjb(fly $$0) {
      this.g = $$0.b("root");
      this.h = this.g.b("body");
      this.i = this.h.b("head");
      this.j = this.i.b("eyes");
      this.k = this.h.b("tongue");
      this.l = this.h.b("left_arm");
      this.m = this.h.b("right_arm");
      this.n = this.g.b("left_leg");
      this.o = this.g.b("right_leg");
      this.p = this.h.b("croaking_body");
   }

   public static fme b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      fmh $$2 = $$1.a("root", fmd.c(), fma.a(0.0F, 24.0F, 0.0F));
      fmh $$3 = $$2.a(
         "body", fmd.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fma.a(0.0F, -2.0F, 4.0F)
      );
      fmh $$4 = $$3.a(
         "head", fmd.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fma.a(0.0F, -2.0F, -1.0F)
      );
      fmh $$5 = $$4.a("eyes", fmd.c(), fma.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fmd.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fma.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fmd.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fma.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fmd.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fmc(-0.1F)), fma.a(0.0F, -1.0F, -5.0F));
      fmh $$6 = $$3.a("tongue", fmd.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fma.a(0.0F, -1.01F, 1.0F));
      fmh $$7 = $$3.a("left_arm", fmd.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fma.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fmd.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fma.a(0.0F, 3.0F, -1.0F));
      fmh $$8 = $$3.a("right_arm", fmd.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fma.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fmd.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fma.a(0.0F, 3.0F, 0.0F));
      fmh $$9 = $$2.a("left_leg", fmd.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fma.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fmd.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fma.a(2.0F, 3.0F, 0.0F));
      fmh $$10 = $$2.a("right_leg", fmd.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fma.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fmd.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fma.a(-2.0F, 3.0F, 0.0F));
      return fme.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fly::c);
      this.a($$0.bY, evh.c, $$3);
      this.a($$0.bZ, evh.a, $$3);
      this.a($$0.ca, evh.d, $$3);
      if ($$0.bc()) {
         this.a(evh.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(evh.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, evh.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fly a() {
      return this.g;
   }
}
