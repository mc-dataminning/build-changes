public class ffb<T extends bwb> extends ffh<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fhx g;
   private final fhx h;
   private final fhx i;
   private final fhx j;
   private final fhx k;
   private final fhx l;
   private final fhx m;
   private final fhx n;
   private final fhx o;
   private final fhx p;

   public ffb(fhx $$0) {
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

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      fig $$2 = $$1.a("root", fic.c(), fhz.a(0.0F, 24.0F, 0.0F));
      fig $$3 = $$2.a(
         "body", fic.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fhz.a(0.0F, -2.0F, 4.0F)
      );
      fig $$4 = $$3.a(
         "head", fic.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fhz.a(0.0F, -2.0F, -1.0F)
      );
      fig $$5 = $$4.a("eyes", fic.c(), fhz.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fic.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhz.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fic.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhz.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fic.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fib(-0.1F)), fhz.a(0.0F, -1.0F, -5.0F));
      fig $$6 = $$3.a("tongue", fic.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fhz.a(0.0F, -1.01F, 1.0F));
      fig $$7 = $$3.a("left_arm", fic.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhz.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fic.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhz.a(0.0F, 3.0F, -1.0F));
      fig $$8 = $$3.a("right_arm", fic.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhz.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fic.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fhz.a(0.0F, 3.0F, 0.0F));
      fig $$9 = $$2.a("left_leg", fic.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhz.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fic.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhz.a(2.0F, 3.0F, 0.0F));
      fig $$10 = $$2.a("right_leg", fic.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhz.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fic.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhz.a(-2.0F, 3.0F, 0.0F));
      return fid.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhx::c);
      this.a($$0.bY, erl.c, $$3);
      this.a($$0.bZ, erl.a, $$3);
      this.a($$0.ca, erl.d, $$3);
      if ($$0.ba()) {
         this.a(erl.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(erl.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, erl.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fhx a() {
      return this.g;
   }
}
