public class fer<T extends bvz> extends fex<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fhn g;
   private final fhn h;
   private final fhn i;
   private final fhn j;
   private final fhn k;
   private final fhn l;
   private final fhn m;
   private final fhn n;
   private final fhn o;
   private final fhn p;

   public fer(fhn $$0) {
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

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      fhw $$2 = $$1.a("root", fhs.c(), fhp.a(0.0F, 24.0F, 0.0F));
      fhw $$3 = $$2.a(
         "body", fhs.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fhp.a(0.0F, -2.0F, 4.0F)
      );
      fhw $$4 = $$3.a(
         "head", fhs.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fhp.a(0.0F, -2.0F, -1.0F)
      );
      fhw $$5 = $$4.a("eyes", fhs.c(), fhp.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fhs.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhp.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fhs.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhp.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fhs.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fhr(-0.1F)), fhp.a(0.0F, -1.0F, -5.0F));
      fhw $$6 = $$3.a("tongue", fhs.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fhp.a(0.0F, -1.01F, 1.0F));
      fhw $$7 = $$3.a("left_arm", fhs.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhp.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fhs.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhp.a(0.0F, 3.0F, -1.0F));
      fhw $$8 = $$3.a("right_arm", fhs.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhp.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fhs.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fhp.a(0.0F, 3.0F, 0.0F));
      fhw $$9 = $$2.a("left_leg", fhs.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhp.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fhs.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhp.a(2.0F, 3.0F, 0.0F));
      fhw $$10 = $$2.a("right_leg", fhs.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhp.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fhs.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhp.a(-2.0F, 3.0F, 0.0F));
      return fht.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhn::c);
      this.a($$0.bY, erh.c, $$3);
      this.a($$0.bZ, erh.a, $$3);
      this.a($$0.ca, erh.d, $$3);
      if ($$0.ba()) {
         this.a(erh.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(erh.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, erh.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fhn a() {
      return this.g;
   }
}
