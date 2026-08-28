public class fuc<T extends cgy> extends fui<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fwz g;
   private final fwz h;
   private final fwz i;
   private final fwz j;
   private final fwz k;
   private final fwz l;
   private final fwz m;
   private final fwz n;
   private final fwz o;
   private final fwz p;

   public fuc(fwz $$0) {
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

   public static fxf b() {
      fxh $$0 = new fxh();
      fxi $$1 = $$0.a();
      fxi $$2 = $$1.a("root", fxe.c(), fxb.a(0.0F, 24.0F, 0.0F));
      fxi $$3 = $$2.a(
         "body", fxe.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxb.a(0.0F, -2.0F, 4.0F)
      );
      fxi $$4 = $$3.a(
         "head", fxe.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxb.a(0.0F, -2.0F, -1.0F)
      );
      fxi $$5 = $$4.a("eyes", fxe.c(), fxb.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxe.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxb.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxe.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxb.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxe.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxd(-0.1F)), fxb.a(0.0F, -1.0F, -5.0F));
      fxi $$6 = $$3.a("tongue", fxe.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxb.a(0.0F, -1.01F, 1.0F));
      fxi $$7 = $$3.a("left_arm", fxe.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxb.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxe.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxb.a(0.0F, 3.0F, -1.0F));
      fxi $$8 = $$3.a("right_arm", fxe.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxb.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxe.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxb.a(0.0F, 3.0F, 0.0F));
      fxi $$9 = $$2.a("left_leg", fxe.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxb.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxe.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxb.a(2.0F, 3.0F, 0.0F));
      fxi $$10 = $$2.a("right_leg", fxe.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxb.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxe.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxb.a(-2.0F, 3.0F, 0.0F));
      return fxf.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fwz::c);
      this.a($$0.cc, fgb.c, $$3);
      this.a($$0.cd, fgb.a, $$3);
      this.a($$0.ce, fgb.d, $$3);
      if ($$0.bh()) {
         this.a(fgb.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fgb.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fgb.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fwz a() {
      return this.g;
   }
}
