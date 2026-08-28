public class fuf<T extends chb> extends ful<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fxc g;
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;
   private final fxc l;
   private final fxc m;
   private final fxc n;
   private final fxc o;
   private final fxc p;

   public fuf(fxc $$0) {
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

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("root", fxh.c(), fxe.a(0.0F, 24.0F, 0.0F));
      fxl $$3 = $$2.a(
         "body", fxh.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxe.a(0.0F, -2.0F, 4.0F)
      );
      fxl $$4 = $$3.a(
         "head", fxh.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxe.a(0.0F, -2.0F, -1.0F)
      );
      fxl $$5 = $$4.a("eyes", fxh.c(), fxe.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxh.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxe.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxh.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxe.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxh.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxg(-0.1F)), fxe.a(0.0F, -1.0F, -5.0F));
      fxl $$6 = $$3.a("tongue", fxh.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxe.a(0.0F, -1.01F, 1.0F));
      fxl $$7 = $$3.a("left_arm", fxh.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxe.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxh.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxe.a(0.0F, 3.0F, -1.0F));
      fxl $$8 = $$3.a("right_arm", fxh.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxe.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxh.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxe.a(0.0F, 3.0F, 0.0F));
      fxl $$9 = $$2.a("left_leg", fxh.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxe.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxh.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxe.a(2.0F, 3.0F, 0.0F));
      fxl $$10 = $$2.a("right_leg", fxh.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxe.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxh.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxe.a(-2.0F, 3.0F, 0.0F));
      return fxi.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxc::c);
      this.a($$0.cc, fge.c, $$3);
      this.a($$0.cd, fge.a, $$3);
      this.a($$0.ce, fge.d, $$3);
      if ($$0.bh()) {
         this.a(fge.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fge.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fge.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fxc a() {
      return this.g;
   }
}
