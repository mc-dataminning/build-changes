public class fhf<T extends bxy> extends fhl<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fkb g;
   private final fkb h;
   private final fkb i;
   private final fkb j;
   private final fkb k;
   private final fkb l;
   private final fkb m;
   private final fkb n;
   private final fkb o;
   private final fkb p;

   public fhf(fkb $$0) {
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

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      fkk $$2 = $$1.a("root", fkg.c(), fkd.a(0.0F, 24.0F, 0.0F));
      fkk $$3 = $$2.a(
         "body", fkg.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fkd.a(0.0F, -2.0F, 4.0F)
      );
      fkk $$4 = $$3.a(
         "head", fkg.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fkd.a(0.0F, -2.0F, -1.0F)
      );
      fkk $$5 = $$4.a("eyes", fkg.c(), fkd.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fkg.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fkd.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fkg.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fkd.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fkg.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fkf(-0.1F)), fkd.a(0.0F, -1.0F, -5.0F));
      fkk $$6 = $$3.a("tongue", fkg.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fkd.a(0.0F, -1.01F, 1.0F));
      fkk $$7 = $$3.a("left_arm", fkg.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fkd.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fkg.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fkd.a(0.0F, 3.0F, -1.0F));
      fkk $$8 = $$3.a("right_arm", fkg.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fkd.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fkg.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fkd.a(0.0F, 3.0F, 0.0F));
      fkk $$9 = $$2.a("left_leg", fkg.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fkd.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fkg.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fkd.a(2.0F, 3.0F, 0.0F));
      fkk $$10 = $$2.a("right_leg", fkg.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fkd.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fkg.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fkd.a(-2.0F, 3.0F, 0.0F));
      return fkh.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fkb::c);
      this.a($$0.bY, etm.c, $$3);
      this.a($$0.bZ, etm.a, $$3);
      this.a($$0.ca, etm.d, $$3);
      if ($$0.ba()) {
         this.a(etm.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(etm.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, etm.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fkb a() {
      return this.g;
   }
}
