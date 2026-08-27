public class fqy<T extends cec> extends fre<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final ftv g;
   private final ftv h;
   private final ftv i;
   private final ftv j;
   private final ftv k;
   private final ftv l;
   private final ftv m;
   private final ftv n;
   private final ftv o;
   private final ftv p;

   public fqy(ftv $$0) {
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

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      fue $$2 = $$1.a("root", fua.c(), ftx.a(0.0F, 24.0F, 0.0F));
      fue $$3 = $$2.a(
         "body", fua.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), ftx.a(0.0F, -2.0F, 4.0F)
      );
      fue $$4 = $$3.a(
         "head", fua.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), ftx.a(0.0F, -2.0F, -1.0F)
      );
      fue $$5 = $$4.a("eyes", fua.c(), ftx.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fua.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), ftx.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fua.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), ftx.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fua.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new ftz(-0.1F)), ftx.a(0.0F, -1.0F, -5.0F));
      fue $$6 = $$3.a("tongue", fua.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), ftx.a(0.0F, -1.01F, 1.0F));
      fue $$7 = $$3.a("left_arm", fua.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), ftx.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fua.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), ftx.a(0.0F, 3.0F, -1.0F));
      fue $$8 = $$3.a("right_arm", fua.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), ftx.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fua.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), ftx.a(0.0F, 3.0F, 0.0F));
      fue $$9 = $$2.a("left_leg", fua.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), ftx.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fua.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), ftx.a(2.0F, 3.0F, 0.0F));
      fue $$10 = $$2.a("right_leg", fua.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), ftx.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fua.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), ftx.a(-2.0F, 3.0F, 0.0F));
      return fub.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftv::c);
      this.a($$0.cc, fcw.c, $$3);
      this.a($$0.cd, fcw.a, $$3);
      this.a($$0.ce, fcw.d, $$3);
      if ($$0.bf()) {
         this.a(fcw.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fcw.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fcw.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public ftv a() {
      return this.g;
   }
}
