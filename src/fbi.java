public class fbi<T extends bta> extends fbo<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fee g;
   private final fee h;
   private final fee i;
   private final fee j;
   private final fee k;
   private final fee l;
   private final fee m;
   private final fee n;
   private final fee o;
   private final fee p;

   public fbi(fee $$0) {
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

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      fen $$2 = $$1.a("root", fej.c(), feg.a(0.0F, 24.0F, 0.0F));
      fen $$3 = $$2.a(
         "body", fej.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), feg.a(0.0F, -2.0F, 4.0F)
      );
      fen $$4 = $$3.a(
         "head", fej.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), feg.a(0.0F, -2.0F, -1.0F)
      );
      fen $$5 = $$4.a("eyes", fej.c(), feg.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fej.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), feg.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fej.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), feg.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fej.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fei(-0.1F)), feg.a(0.0F, -1.0F, -5.0F));
      fen $$6 = $$3.a("tongue", fej.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), feg.a(0.0F, -1.01F, 1.0F));
      fen $$7 = $$3.a("left_arm", fej.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), feg.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fej.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), feg.a(0.0F, 3.0F, -1.0F));
      fen $$8 = $$3.a("right_arm", fej.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), feg.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fej.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), feg.a(0.0F, 3.0F, 0.0F));
      fen $$9 = $$2.a("left_leg", fej.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), feg.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fej.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), feg.a(2.0F, 3.0F, 0.0F));
      fen $$10 = $$2.a("right_leg", fej.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), feg.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fej.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), feg.a(-2.0F, 3.0F, 0.0F));
      return fek.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fee::c);
      this.a($$0.bY, eoi.c, $$3);
      this.a($$0.bZ, eoi.a, $$3);
      this.a($$0.ca, eoi.d, $$3);
      if ($$0.aY()) {
         this.a(eoi.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(eoi.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, eoi.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fee a() {
      return this.g;
   }
}
