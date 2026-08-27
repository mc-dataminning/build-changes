public class fka<T extends bzn> extends fkg<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fmx g;
   private final fmx h;
   private final fmx i;
   private final fmx j;
   private final fmx k;
   private final fmx l;
   private final fmx m;
   private final fmx n;
   private final fmx o;
   private final fmx p;

   public fka(fmx $$0) {
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

   public static fnd b() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a("root", fnc.c(), fmz.a(0.0F, 24.0F, 0.0F));
      fng $$3 = $$2.a(
         "body", fnc.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fmz.a(0.0F, -2.0F, 4.0F)
      );
      fng $$4 = $$3.a(
         "head", fnc.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fmz.a(0.0F, -2.0F, -1.0F)
      );
      fng $$5 = $$4.a("eyes", fnc.c(), fmz.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fnc.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fmz.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fnc.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fmz.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fnc.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fnb(-0.1F)), fmz.a(0.0F, -1.0F, -5.0F));
      fng $$6 = $$3.a("tongue", fnc.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fmz.a(0.0F, -1.01F, 1.0F));
      fng $$7 = $$3.a("left_arm", fnc.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fmz.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fnc.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmz.a(0.0F, 3.0F, -1.0F));
      fng $$8 = $$3.a("right_arm", fnc.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fmz.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fnc.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fmz.a(0.0F, 3.0F, 0.0F));
      fng $$9 = $$2.a("left_leg", fnc.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fmz.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fnc.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmz.a(2.0F, 3.0F, 0.0F));
      fng $$10 = $$2.a("right_leg", fnc.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fmz.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fnc.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmz.a(-2.0F, 3.0F, 0.0F));
      return fnd.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmx::c);
      this.a($$0.bY, ewf.c, $$3);
      this.a($$0.bZ, ewf.a, $$3);
      this.a($$0.ca, ewf.d, $$3);
      if ($$0.bc()) {
         this.a(ewf.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ewf.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, ewf.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fmx a() {
      return this.g;
   }
}
