public class foh<T extends ccw> extends fon<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;
   private final frf k;
   private final frf l;
   private final frf m;
   private final frf n;
   private final frf o;
   private final frf p;

   public foh(frf $$0) {
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

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      fro $$2 = $$1.a("root", frk.c(), frh.a(0.0F, 24.0F, 0.0F));
      fro $$3 = $$2.a(
         "body", frk.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), frh.a(0.0F, -2.0F, 4.0F)
      );
      fro $$4 = $$3.a(
         "head", frk.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), frh.a(0.0F, -2.0F, -1.0F)
      );
      fro $$5 = $$4.a("eyes", frk.c(), frh.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", frk.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), frh.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", frk.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), frh.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", frk.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new frj(-0.1F)), frh.a(0.0F, -1.0F, -5.0F));
      fro $$6 = $$3.a("tongue", frk.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), frh.a(0.0F, -1.01F, 1.0F));
      fro $$7 = $$3.a("left_arm", frk.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), frh.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", frk.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), frh.a(0.0F, 3.0F, -1.0F));
      fro $$8 = $$3.a("right_arm", frk.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), frh.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", frk.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), frh.a(0.0F, 3.0F, 0.0F));
      fro $$9 = $$2.a("left_leg", frk.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), frh.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", frk.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), frh.a(2.0F, 3.0F, 0.0F));
      fro $$10 = $$2.a("right_leg", frk.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), frh.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", frk.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), frh.a(-2.0F, 3.0F, 0.0F));
      return frl.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frf::c);
      this.a($$0.cc, fag.c, $$3);
      this.a($$0.cd, fag.a, $$3);
      this.a($$0.ce, fag.d, $$3);
      if ($$0.bf()) {
         this.a(fag.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fag.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fag.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public frf a() {
      return this.g;
   }
}
