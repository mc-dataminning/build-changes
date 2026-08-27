public class fnh<T extends cce> extends fnn<T> {
   private static final float a = 1.5F;
   private static final float b = 1.0F;
   private static final float f = 2.5F;
   private final fqf g;
   private final fqf h;
   private final fqf i;
   private final fqf j;
   private final fqf k;
   private final fqf l;
   private final fqf m;
   private final fqf n;
   private final fqf o;
   private final fqf p;

   public fnh(fqf $$0) {
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

   public static fql b() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      fqo $$2 = $$1.a("root", fqk.c(), fqh.a(0.0F, 24.0F, 0.0F));
      fqo $$3 = $$2.a(
         "body", fqk.c().a(3, 1).a(-3.5F, -2.0F, -8.0F, 7.0F, 3.0F, 9.0F).a(23, 22).a(-3.5F, -1.0F, -8.0F, 7.0F, 0.0F, 9.0F), fqh.a(0.0F, -2.0F, 4.0F)
      );
      fqo $$4 = $$3.a(
         "head", fqk.c().a(23, 13).a(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F).a(0, 13).a(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F), fqh.a(0.0F, -2.0F, -1.0F)
      );
      fqo $$5 = $$4.a("eyes", fqk.c(), fqh.a(-0.5F, 0.0F, 2.0F));
      $$5.a("right_eye", fqk.c().a(0, 0).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fqh.a(-1.5F, -3.0F, -6.5F));
      $$5.a("left_eye", fqk.c().a(0, 5).a(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F), fqh.a(2.5F, -3.0F, -6.5F));
      $$3.a("croaking_body", fqk.c().a(26, 5).a(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new fqj(-0.1F)), fqh.a(0.0F, -1.0F, -5.0F));
      fqo $$6 = $$3.a("tongue", fqk.c().a(17, 13).a(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F), fqh.a(0.0F, -1.01F, 1.0F));
      fqo $$7 = $$3.a("left_arm", fqk.c().a(0, 32).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fqh.a(4.0F, -1.0F, -6.5F));
      $$7.a("left_hand", fqk.c().a(18, 40).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fqh.a(0.0F, 3.0F, -1.0F));
      fqo $$8 = $$3.a("right_arm", fqk.c().a(0, 38).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 3.0F), fqh.a(-4.0F, -1.0F, -6.5F));
      $$8.a("right_hand", fqk.c().a(2, 40).a(-4.0F, 0.01F, -5.0F, 8.0F, 0.0F, 8.0F), fqh.a(0.0F, 3.0F, 0.0F));
      fqo $$9 = $$2.a("left_leg", fqk.c().a(14, 25).a(-1.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fqh.a(3.5F, -3.0F, 4.0F));
      $$9.a("left_foot", fqk.c().a(2, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fqh.a(2.0F, 3.0F, 0.0F));
      fqo $$10 = $$2.a("right_leg", fqk.c().a(0, 25).a(-2.0F, 0.0F, -2.0F, 3.0F, 3.0F, 4.0F), fqh.a(-3.5F, -3.0F, 4.0F));
      $$10.a("right_foot", fqk.c().a(18, 32).a(-4.0F, 0.01F, -4.0F, 8.0F, 0.0F, 8.0F), fqh.a(-2.0F, 3.0F, 0.0F));
      return fql.a($$0, 48, 48);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fqf::c);
      this.a($$0.ca, ezi.c, $$3);
      this.a($$0.cb, ezi.a, $$3);
      this.a($$0.cc, ezi.d, $$3);
      if ($$0.bc()) {
         this.a(ezi.e, $$1, $$2, 1.0F, 2.5F);
      } else {
         this.a(ezi.b, $$1, $$2, 1.5F, 2.5F);
      }

      this.a($$0.cd, ezi.f, $$3);
      this.p.k = $$0.cb.c();
   }

   @Override
   public fqf a() {
      return this.g;
   }
}
