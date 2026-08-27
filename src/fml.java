public class fml<T extends cbp> extends fmr<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fpj g;
   private final fpj h;
   private final fpj i;
   private final fpj j;
   private final fpj k;
   private final fpj l;
   private final fpj m;
   private final fpj n;
   private final fpj o;
   private final fpj p;

   public fml(fpj $$0) {
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

   public static fpp b() {
      fpr $$0 = new fpr();
      fps $$1 = $$0.a();
      fps $$2 = $$1.a("root", fpo.c(), fpl.a(0.0F, 24.0F, 0.0F));
      fps $$3 = $$2.a(
         "body", fpo.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fpl.a(0.0F, -2.0F, 4.0F)
      );
      fps $$4 = $$3.a(
         "head", fpo.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fpl.a(0.0F, -2.0F, -1.0F)
      );
      fps $$5 = $$4.a("eyes", fpo.c(), fpl.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fpo.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fpl.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fpo.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fpl.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fpo.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fpn(-0.1F)), fpl.a(0.0F, -1.0F, -5.0F));
      fps $$6 = $$3.a("tongue", fpo.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fpl.a(0.0F, -1.01F, 1.0F));
      fps $$7 = $$3.a("left_arm", fpo.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fpl.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fpo.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fpl.a(0.0F, 3.0F, -1.0F));
      fps $$8 = $$3.a("right_arm", fpo.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fpl.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fpo.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fpl.a(0.0F, 3.0F, 0.0F));
      fps $$9 = $$2.a("left_leg", fpo.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fpl.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fpo.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fpl.a(2.0F, 3.0F, 0.0F));
      fps $$10 = $$2.a("right_leg", fpo.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fpl.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fpo.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fpl.a(-2.0F, 3.0F, 0.0F));
      return fpp.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fpj::c);
      this.a($$0.bY, eym.c, $$3);
      this.a($$0.bZ, eym.a, $$3);
      this.a($$0.ca, eym.d, $$3);
      if ($$0.bc()) {
         this.a(eym.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(eym.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, eym.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fpj a() {
      return this.g;
   }
}
