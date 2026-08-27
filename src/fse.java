public class fse<T extends cfj> extends fsk<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fvb g;
   private final fvb h;
   private final fvb i;
   private final fvb j;
   private final fvb k;
   private final fvb l;
   private final fvb m;
   private final fvb n;
   private final fvb o;
   private final fvb p;

   public fse(fvb $$0) {
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

   public static fvh b() {
      fvj $$0 = new fvj();
      fvk $$1 = $$0.a();
      fvk $$2 = $$1.a("root", fvg.c(), fvd.a(0.0F, 24.0F, 0.0F));
      fvk $$3 = $$2.a(
         "body", fvg.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fvd.a(0.0F, -2.0F, 4.0F)
      );
      fvk $$4 = $$3.a(
         "head", fvg.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fvd.a(0.0F, -2.0F, -1.0F)
      );
      fvk $$5 = $$4.a("eyes", fvg.c(), fvd.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fvg.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fvd.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fvg.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fvd.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fvg.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fvf(-0.1F)), fvd.a(0.0F, -1.0F, -5.0F));
      fvk $$6 = $$3.a("tongue", fvg.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fvd.a(0.0F, -1.01F, 1.0F));
      fvk $$7 = $$3.a("left_arm", fvg.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fvd.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fvg.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fvd.a(0.0F, 3.0F, -1.0F));
      fvk $$8 = $$3.a("right_arm", fvg.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fvd.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fvg.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fvd.a(0.0F, 3.0F, 0.0F));
      fvk $$9 = $$2.a("left_leg", fvg.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fvd.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fvg.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fvd.a(2.0F, 3.0F, 0.0F));
      fvk $$10 = $$2.a("right_leg", fvg.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fvd.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fvg.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fvd.a(-2.0F, 3.0F, 0.0F));
      return fvh.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fvb::c);
      this.a($$0.cc, fec.c, $$3);
      this.a($$0.cd, fec.a, $$3);
      this.a($$0.ce, fec.d, $$3);
      if ($$0.bf()) {
         this.a(fec.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fec.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fec.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fvb a() {
      return this.g;
   }
}
