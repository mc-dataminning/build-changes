public class fsz<T extends cfy> extends ftf<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fvw g;
   private final fvw h;
   private final fvw i;
   private final fvw j;
   private final fvw k;
   private final fvw l;
   private final fvw m;
   private final fvw n;
   private final fvw o;
   private final fvw p;

   public fsz(fvw $$0) {
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

   public static fwc b() {
      fwe $$0 = new fwe();
      fwf $$1 = $$0.a();
      fwf $$2 = $$1.a("root", fwb.c(), fvy.a(0.0F, 24.0F, 0.0F));
      fwf $$3 = $$2.a(
         "body", fwb.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fvy.a(0.0F, -2.0F, 4.0F)
      );
      fwf $$4 = $$3.a(
         "head", fwb.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fvy.a(0.0F, -2.0F, -1.0F)
      );
      fwf $$5 = $$4.a("eyes", fwb.c(), fvy.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fwb.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fvy.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fwb.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fvy.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fwb.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fwa(-0.1F)), fvy.a(0.0F, -1.0F, -5.0F));
      fwf $$6 = $$3.a("tongue", fwb.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fvy.a(0.0F, -1.01F, 1.0F));
      fwf $$7 = $$3.a("left_arm", fwb.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fvy.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fwb.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fvy.a(0.0F, 3.0F, -1.0F));
      fwf $$8 = $$3.a("right_arm", fwb.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fvy.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fwb.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fvy.a(0.0F, 3.0F, 0.0F));
      fwf $$9 = $$2.a("left_leg", fwb.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fvy.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fwb.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fvy.a(2.0F, 3.0F, 0.0F));
      fwf $$10 = $$2.a("right_leg", fwb.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fvy.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fwb.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fvy.a(-2.0F, 3.0F, 0.0F));
      return fwc.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fvw::c);
      this.a($$0.cc, fex.c, $$3);
      this.a($$0.cd, fex.a, $$3);
      this.a($$0.ce, fex.d, $$3);
      if ($$0.bh()) {
         this.a(fex.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fex.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fex.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public fvw a() {
      return this.g;
   }
}
