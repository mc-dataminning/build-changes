public class fub<T extends cgx> extends fuh<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fwy g;
   private final fwy h;
   private final fwy i;
   private final fwy j;
   private final fwy k;
   private final fwy l;
   private final fwy m;
   private final fwy n;
   private final fwy o;
   private final fwy p;

   public fub(fwy $$0) {
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

   public static fxe b() {
      fxg $$0 = new fxg();
      fxh $$1 = $$0.a();
      fxh $$2 = $$1.a("root", fxd.c(), fxa.a(0.0F, 24.0F, 0.0F));
      fxh $$3 = $$2.a(
         "body", fxd.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxa.a(0.0F, -2.0F, 4.0F)
      );
      fxh $$4 = $$3.a(
         "head", fxd.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxa.a(0.0F, -2.0F, -1.0F)
      );
      fxh $$5 = $$4.a("eyes", fxd.c(), fxa.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxd.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxa.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxd.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxa.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxd.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxc(-0.1F)), fxa.a(0.0F, -1.0F, -5.0F));
      fxh $$6 = $$3.a("tongue", fxd.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxa.a(0.0F, -1.01F, 1.0F));
      fxh $$7 = $$3.a("left_arm", fxd.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxa.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxd.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxa.a(0.0F, 3.0F, -1.0F));
      fxh $$8 = $$3.a("right_arm", fxd.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxa.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxd.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxa.a(0.0F, 3.0F, 0.0F));
      fxh $$9 = $$2.a("left_leg", fxd.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxa.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxd.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxa.a(2.0F, 3.0F, 0.0F));
      fxh $$10 = $$2.a("right_leg", fxd.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxa.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxd.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxa.a(-2.0F, 3.0F, 0.0F));
      return fxe.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwy::c);
      this.a($$0.cc, fga.c, $$3);
      this.a($$0.cd, fga.a, $$3);
      this.a($$0.ce, fga.d, $$3);
      if ($$0.bh()) {
         this.a(fga.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fga.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fga.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fwy a() {
      return this.g;
   }
}
