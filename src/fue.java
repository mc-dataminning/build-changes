public class fue<T extends cha> extends fuk<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fxb g;
   private final fxb h;
   private final fxb i;
   private final fxb j;
   private final fxb k;
   private final fxb l;
   private final fxb m;
   private final fxb n;
   private final fxb o;
   private final fxb p;

   public fue(fxb $$0) {
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

   public static fxh b() {
      fxj $$0 = new fxj();
      fxk $$1 = $$0.a();
      fxk $$2 = $$1.a("root", fxg.c(), fxd.a(0.0F, 24.0F, 0.0F));
      fxk $$3 = $$2.a(
         "body", fxg.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fxd.a(0.0F, -2.0F, 4.0F)
      );
      fxk $$4 = $$3.a(
         "head", fxg.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fxd.a(0.0F, -2.0F, -1.0F)
      );
      fxk $$5 = $$4.a("eyes", fxg.c(), fxd.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fxg.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxd.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fxg.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fxd.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fxg.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fxf(-0.1F)), fxd.a(0.0F, -1.0F, -5.0F));
      fxk $$6 = $$3.a("tongue", fxg.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fxd.a(0.0F, -1.01F, 1.0F));
      fxk $$7 = $$3.a("left_arm", fxg.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxd.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fxg.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxd.a(0.0F, 3.0F, -1.0F));
      fxk $$8 = $$3.a("right_arm", fxg.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fxd.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fxg.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fxd.a(0.0F, 3.0F, 0.0F));
      fxk $$9 = $$2.a("left_leg", fxg.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxd.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fxg.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxd.a(2.0F, 3.0F, 0.0F));
      fxk $$10 = $$2.a("right_leg", fxg.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fxd.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fxg.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fxd.a(-2.0F, 3.0F, 0.0F));
      return fxh.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxb::c);
      this.a($$0.cc, fgd.c, $$3);
      this.a($$0.cd, fgd.a, $$3);
      this.a($$0.ce, fgd.d, $$3);
      if ($$0.bh()) {
         this.a(fgd.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fgd.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fgd.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fxb a() {
      return this.g;
   }
}
