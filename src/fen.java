public class fen<T extends bvx> extends fet<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fhj g;
   private final fhj h;
   private final fhj i;
   private final fhj j;
   private final fhj k;
   private final fhj l;
   private final fhj m;
   private final fhj n;
   private final fhj o;
   private final fhj p;

   public fen(fhj $$0) {
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

   public static fhp b() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      fhs $$2 = $$1.a("root", fho.c(), fhl.a(0.0F, 24.0F, 0.0F));
      fhs $$3 = $$2.a(
         "body", fho.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fhl.a(0.0F, -2.0F, 4.0F)
      );
      fhs $$4 = $$3.a(
         "head", fho.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fhl.a(0.0F, -2.0F, -1.0F)
      );
      fhs $$5 = $$4.a("eyes", fho.c(), fhl.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fho.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhl.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fho.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fhl.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fho.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fhn(-0.1F)), fhl.a(0.0F, -1.0F, -5.0F));
      fhs $$6 = $$3.a("tongue", fho.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fhl.a(0.0F, -1.01F, 1.0F));
      fhs $$7 = $$3.a("left_arm", fho.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhl.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fho.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhl.a(0.0F, 3.0F, -1.0F));
      fhs $$8 = $$3.a("right_arm", fho.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fhl.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fho.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fhl.a(0.0F, 3.0F, 0.0F));
      fhs $$9 = $$2.a("left_leg", fho.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhl.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fho.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhl.a(2.0F, 3.0F, 0.0F));
      fhs $$10 = $$2.a("right_leg", fho.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fhl.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fho.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fhl.a(-2.0F, 3.0F, 0.0F));
      return fhp.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fhj::c);
      this.a($$0.bY, eri.c, $$3);
      this.a($$0.bZ, eri.a, $$3);
      this.a($$0.ca, eri.d, $$3);
      if ($$0.ba()) {
         this.a(eri.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(eri.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, eri.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fhj a() {
      return this.g;
   }
}
