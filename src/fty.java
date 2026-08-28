public class fty<T extends cgu> extends fue<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fwv g;
   private final fwv h;
   private final fwv i;
   private final fwv j;
   private final fwv k;
   private final fwv l;
   private final fwv m;
   private final fwv n;
   private final fwv o;
   private final fwv p;

   public fty(fwv $$0) {
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

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      fxe $$2 = $$1.a("root", fxa.c(), fwx.a(0.0F, 24.0F, 0.0F));
      fxe $$3 = $$2.a(
         "body", fxa.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fwx.a(0.0F, -2.0F, 4.0F)
      );
      fxe $$4 = $$3.a(
         "head", fxa.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fwx.a(0.0F, -2.0F, -1.0F)
      );
      fxe $$5 = $$4.a("eyes", fxa.c(), fwx.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxa.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fwx.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxa.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fwx.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxa.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fwz(-0.1F)), fwx.a(0.0F, -1.0F, -5.0F));
      fxe $$6 = $$3.a("tongue", fxa.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fwx.a(0.0F, -1.01F, 1.0F));
      fxe $$7 = $$3.a("left_arm", fxa.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fwx.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxa.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fwx.a(0.0F, 3.0F, -1.0F));
      fxe $$8 = $$3.a("right_arm", fxa.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fwx.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxa.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fwx.a(0.0F, 3.0F, 0.0F));
      fxe $$9 = $$2.a("left_leg", fxa.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fwx.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxa.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fwx.a(2.0F, 3.0F, 0.0F));
      fxe $$10 = $$2.a("right_leg", fxa.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fwx.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxa.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fwx.a(-2.0F, 3.0F, 0.0F));
      return fxb.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwv::c);
      this.a($$0.cc, ffx.c, $$3);
      this.a($$0.cd, ffx.a, $$3);
      this.a($$0.ce, ffx.d, $$3);
      if ($$0.bh()) {
         this.a(ffx.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ffx.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, ffx.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fwv a() {
      return this.g;
   }
}
