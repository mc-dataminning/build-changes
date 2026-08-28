public class fud<T extends cgz> extends fuj<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fxa g;
   private final fxa h;
   private final fxa i;
   private final fxa j;
   private final fxa k;
   private final fxa l;
   private final fxa m;
   private final fxa n;
   private final fxa o;
   private final fxa p;

   public fud(fxa $$0) {
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

   public static fxg b() {
      fxi $$0 = new fxi();
      fxj $$1 = $$0.a();
      fxj $$2 = $$1.a("root", fxf.c(), fxc.a(0.0F, 24.0F, 0.0F));
      fxj $$3 = $$2.a(
         "body", fxf.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxc.a(0.0F, -2.0F, 4.0F)
      );
      fxj $$4 = $$3.a(
         "head", fxf.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxc.a(0.0F, -2.0F, -1.0F)
      );
      fxj $$5 = $$4.a("eyes", fxf.c(), fxc.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxf.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxc.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxf.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxc.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxf.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxe(-0.1F)), fxc.a(0.0F, -1.0F, -5.0F));
      fxj $$6 = $$3.a("tongue", fxf.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxc.a(0.0F, -1.01F, 1.0F));
      fxj $$7 = $$3.a("left_arm", fxf.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxc.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxf.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxc.a(0.0F, 3.0F, -1.0F));
      fxj $$8 = $$3.a("right_arm", fxf.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxc.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxf.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxc.a(0.0F, 3.0F, 0.0F));
      fxj $$9 = $$2.a("left_leg", fxf.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxc.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxf.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxc.a(2.0F, 3.0F, 0.0F));
      fxj $$10 = $$2.a("right_leg", fxf.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxc.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxf.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxc.a(-2.0F, 3.0F, 0.0F));
      return fxg.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxa::c);
      this.a($$0.cc, fgc.c, $$3);
      this.a($$0.cd, fgc.a, $$3);
      this.a($$0.ce, fgc.d, $$3);
      if ($$0.bh()) {
         this.a(fgc.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fgc.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fgc.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fxa a() {
      return this.g;
   }
}
