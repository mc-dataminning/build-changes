public class ffg<T extends bwg> extends ffm<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fic g;
   private final fic h;
   private final fic i;
   private final fic j;
   private final fic k;
   private final fic l;
   private final fic m;
   private final fic n;
   private final fic o;
   private final fic p;

   public ffg(fic $$0) {
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

   public static fii b() {
      fik $$0 = new fik();
      fil $$1 = $$0.a();
      fil $$2 = $$1.a("root", fih.c(), fie.a(0.0F, 24.0F, 0.0F));
      fil $$3 = $$2.a(
         "body", fih.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fie.a(0.0F, -2.0F, 4.0F)
      );
      fil $$4 = $$3.a(
         "head", fih.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fie.a(0.0F, -2.0F, -1.0F)
      );
      fil $$5 = $$4.a("eyes", fih.c(), fie.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fih.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fie.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fih.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fie.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fih.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fig(-0.1F)), fie.a(0.0F, -1.0F, -5.0F));
      fil $$6 = $$3.a("tongue", fih.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fie.a(0.0F, -1.01F, 1.0F));
      fil $$7 = $$3.a("left_arm", fih.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fie.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fih.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fie.a(0.0F, 3.0F, -1.0F));
      fil $$8 = $$3.a("right_arm", fih.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fie.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fih.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fie.a(0.0F, 3.0F, 0.0F));
      fil $$9 = $$2.a("left_leg", fih.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fie.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fih.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fie.a(2.0F, 3.0F, 0.0F));
      fil $$10 = $$2.a("right_leg", fih.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fie.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fih.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fie.a(-2.0F, 3.0F, 0.0F));
      return fii.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fic::c);
      this.a($$0.bY, erq.c, $$3);
      this.a($$0.bZ, erq.a, $$3);
      this.a($$0.ca, erq.d, $$3);
      if ($$0.ba()) {
         this.a(erq.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(erq.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, erq.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fic a() {
      return this.g;
   }
}
