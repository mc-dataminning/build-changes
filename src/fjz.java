public class fjz<T extends bzm> extends fkf<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fmw g;
   private final fmw h;
   private final fmw i;
   private final fmw j;
   private final fmw k;
   private final fmw l;
   private final fmw m;
   private final fmw n;
   private final fmw o;
   private final fmw p;

   public fjz(fmw $$0) {
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

   public static fnc b() {
      fne $$0 = new fne();
      fnf $$1 = $$0.a();
      fnf $$2 = $$1.a("root", fnb.c(), fmy.a(0.0F, 24.0F, 0.0F));
      fnf $$3 = $$2.a(
         "body", fnb.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fmy.a(0.0F, -2.0F, 4.0F)
      );
      fnf $$4 = $$3.a(
         "head", fnb.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fmy.a(0.0F, -2.0F, -1.0F)
      );
      fnf $$5 = $$4.a("eyes", fnb.c(), fmy.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fnb.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fmy.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fnb.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fmy.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fnb.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fna(-0.1F)), fmy.a(0.0F, -1.0F, -5.0F));
      fnf $$6 = $$3.a("tongue", fnb.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fmy.a(0.0F, -1.01F, 1.0F));
      fnf $$7 = $$3.a("left_arm", fnb.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fmy.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fnb.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmy.a(0.0F, 3.0F, -1.0F));
      fnf $$8 = $$3.a("right_arm", fnb.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fmy.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fnb.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fmy.a(0.0F, 3.0F, 0.0F));
      fnf $$9 = $$2.a("left_leg", fnb.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fmy.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fnb.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmy.a(2.0F, 3.0F, 0.0F));
      fnf $$10 = $$2.a("right_leg", fnb.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fmy.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fnb.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fmy.a(-2.0F, 3.0F, 0.0F));
      return fnc.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmw::c);
      this.a($$0.bY, ewe.c, $$3);
      this.a($$0.bZ, ewe.a, $$3);
      this.a($$0.ca, ewe.d, $$3);
      if ($$0.bc()) {
         this.a(ewe.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ewe.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, ewe.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fmw a() {
      return this.g;
   }
}
