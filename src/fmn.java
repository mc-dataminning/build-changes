public class fmn<T extends cgc> extends fnn<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fqf g;
   private final fqf h;
   private final fqf i;
   private final fqf j;
   private final fqf k;
   private final fqf l;
   private final fqf m;
   private final fqf n;

   public fmn(fqf $$0) {
      super(fwy::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fql a(int $$0, int $$1) {
      fqn $$2 = new fqn();
      fqo $$3 = $$2.a();
      fqo $$4 = $$3.a("body", fqk.c(), fqh.a(0.0F, 0.0F, 0.0F));
      fqo $$5 = $$4.a("rods", fqk.c(), fqh.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fqk.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fqj(0.0F)), fqh.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fqk.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fqj(0.0F)), fqh.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fqk.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fqj(0.0F)), fqh.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fqo $$6 = $$4.a(
         "head",
         fqk.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fqj(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fqj(0.0F)),
         fqh.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fqk.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fqj(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fqj(0.0F)),
         fqh.a(0.0F, 0.0F, 0.0F)
      );
      fqo $$7 = $$3.a("wind_body", fqk.c(), fqh.a(0.0F, 0.0F, 0.0F));
      fqo $$8 = $$7.a("wind_bottom", fqk.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fqj(0.0F)), fqh.a(0.0F, 24.0F, 0.0F));
      fqo $$9 = $$8.a(
         "wind_mid",
         fqk.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fqj(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fqj(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fqj(0.0F)),
         fqh.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fqk.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fqj(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fqj(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fqj(0.0F)),
         fqh.a(0.0F, -6.0F, 0.0F)
      );
      return fql.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fqf::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = awm.b($$6) * 1.0F * 0.6F;
      this.k.d = awm.a($$6) * 1.0F * 0.6F;
      this.l.b = awm.a($$6) * 0.5F * 0.8F;
      this.l.d = awm.b($$6) * 0.8F;
      this.m.b = awm.b($$6) * -0.25F * 1.0F;
      this.m.d = awm.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + awm.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bV, ezg.a, $$3);
      this.a($$0.c, ezg.c, $$3);
      this.a($$0.d, ezg.d, $$3);
      this.a($$0.e, ezg.b, $$3);
   }

   @Override
   public fqf a() {
      return this.g;
   }

   public fqf b() {
      return this.h;
   }

   public fqf c() {
      return this.i;
   }

   public fqf d() {
      return this.n;
   }

   public fqf e() {
      return this.j;
   }
}
