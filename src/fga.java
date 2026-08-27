public class fga<T extends bxj> extends fgg<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fiw g;
   private final fiw h;
   private final fiw i;
   private final fiw j;
   private final fiw k;
   private final fiw l;
   private final fiw m;
   private final fiw n;
   private final fiw o;
   private final fiw p;

   public fga(fiw $$0) {
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

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      fjf $$2 = $$1.a("root", fjb.c(), fiy.a(0.0F, 24.0F, 0.0F));
      fjf $$3 = $$2.a(
         "body", fjb.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fiy.a(0.0F, -2.0F, 4.0F)
      );
      fjf $$4 = $$3.a(
         "head", fjb.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fiy.a(0.0F, -2.0F, -1.0F)
      );
      fjf $$5 = $$4.a("eyes", fjb.c(), fiy.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fjb.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fiy.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fjb.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fiy.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fjb.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fja(-0.1F)), fiy.a(0.0F, -1.0F, -5.0F));
      fjf $$6 = $$3.a("tongue", fjb.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fiy.a(0.0F, -1.01F, 1.0F));
      fjf $$7 = $$3.a("left_arm", fjb.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fiy.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fjb.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fiy.a(0.0F, 3.0F, -1.0F));
      fjf $$8 = $$3.a("right_arm", fjb.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fiy.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fjb.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fiy.a(0.0F, 3.0F, 0.0F));
      fjf $$9 = $$2.a("left_leg", fjb.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fiy.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fjb.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fiy.a(2.0F, 3.0F, 0.0F));
      fjf $$10 = $$2.a("right_leg", fjb.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fiy.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fjb.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fiy.a(-2.0F, 3.0F, 0.0F));
      return fjc.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fiw::c);
      this.a($$0.bY, esj.c, $$3);
      this.a($$0.bZ, esj.a, $$3);
      this.a($$0.ca, esj.d, $$3);
      if ($$0.ba()) {
         this.a(esj.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(esj.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cb, esj.f, $$3);
      this.p.k = $$0.bZ.c();
   }

   @Override
   public fiw a() {
      return this.g;
   }
}
