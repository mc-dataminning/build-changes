public class fof<T extends ccv> extends fol<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final frd k;
   private final frd l;
   private final frd m;
   private final frd n;
   private final frd o;
   private final frd p;

   public fof(frd $$0) {
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

   public static frj b() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      frm $$2 = $$1.a("root", fri.c(), frf.a(0.0F, 24.0F, 0.0F));
      frm $$3 = $$2.a(
         "body", fri.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), frf.a(0.0F, -2.0F, 4.0F)
      );
      frm $$4 = $$3.a(
         "head", fri.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), frf.a(0.0F, -2.0F, -1.0F)
      );
      frm $$5 = $$4.a("eyes", fri.c(), frf.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fri.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), frf.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fri.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), frf.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fri.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new frh(-0.1F)), frf.a(0.0F, -1.0F, -5.0F));
      frm $$6 = $$3.a("tongue", fri.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), frf.a(0.0F, -1.01F, 1.0F));
      frm $$7 = $$3.a("left_arm", fri.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), frf.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fri.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), frf.a(0.0F, 3.0F, -1.0F));
      frm $$8 = $$3.a("right_arm", fri.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), frf.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fri.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), frf.a(0.0F, 3.0F, 0.0F));
      frm $$9 = $$2.a("left_leg", fri.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), frf.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fri.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), frf.a(2.0F, 3.0F, 0.0F));
      frm $$10 = $$2.a("right_leg", fri.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), frf.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fri.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), frf.a(-2.0F, 3.0F, 0.0F));
      return frj.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frd::c);
      this.a($$0.cc, fae.c, $$3);
      this.a($$0.cd, fae.a, $$3);
      this.a($$0.ce, fae.d, $$3);
      if ($$0.bf()) {
         this.a(fae.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(fae.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cf, fae.f, $$3);
      this.p.k = $$0.cd.c();
   }

   @Override
   public frd a() {
      return this.g;
   }
}
