public class fqp<T extends cdv> extends fqv<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final ftm g;
   private final ftm h;
   private final ftm i;
   private final ftm j;
   private final ftm k;
   private final ftm l;
   private final ftm m;
   private final ftm n;
   private final ftm o;
   private final ftm p;

   public fqp(ftm $$0) {
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

   public static fts b() {
      ftu $$0 = new ftu();
      ftv $$1 = $$0.a();
      ftv $$2 = $$1.a("root", ftr.c(), fto.a(0.0F, 24.0F, 0.0F));
      ftv $$3 = $$2.a(
         "body", ftr.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fto.a(0.0F, -2.0F, 4.0F)
      );
      ftv $$4 = $$3.a(
         "head", ftr.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fto.a(0.0F, -2.0F, -1.0F)
      );
      ftv $$5 = $$4.a("eyes", ftr.c(), fto.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", ftr.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fto.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", ftr.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fto.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", ftr.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new ftq(-0.1F)), fto.a(0.0F, -1.0F, -5.0F));
      ftv $$6 = $$3.a("tongue", ftr.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fto.a(0.0F, -1.01F, 1.0F));
      ftv $$7 = $$3.a("left_arm", ftr.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fto.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", ftr.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fto.a(0.0F, 3.0F, -1.0F));
      ftv $$8 = $$3.a("right_arm", ftr.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fto.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", ftr.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fto.a(0.0F, 3.0F, 0.0F));
      ftv $$9 = $$2.a("left_leg", ftr.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fto.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", ftr.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fto.a(2.0F, 3.0F, 0.0F));
      ftv $$10 = $$2.a("right_leg", ftr.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fto.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", ftr.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fto.a(-2.0F, 3.0F, 0.0F));
      return fts.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftm::c);
      this.a($$0.cc, fcn.c, $$3);
      this.a($$0.cd, fcn.a, $$3);
      this.a($$0.ce, fcn.d, $$3);
      if ($$0.bf()) {
         this.a(fcn.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fcn.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fcn.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public ftm a() {
      return this.g;
   }
}
