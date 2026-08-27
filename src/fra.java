public class fra<T extends cin> extends fsa<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fur g;
   private final fur h;
   private final fur i;
   private final fur j;
   private final fur k;
   private final fur l;
   private final fur m;
   private final fur n;

   public fra(fur $$0) {
      super(gbm::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fux a(int $$0, int $$1) {
      fuz $$2 = new fuz();
      fva $$3 = $$2.a();
      fva $$4 = $$3.a("body", fuw.c(), fut.a(0.0F, 0.0F, 0.0F));
      fva $$5 = $$4.a("rods", fuw.c(), fut.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fuw.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fuv(0.0F)), fut.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fuw.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fuv(0.0F)), fut.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fuw.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fuv(0.0F)), fut.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fva $$6 = $$4.a(
         "head",
         fuw.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fuv(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fuv(0.0F)),
         fut.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fuw.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fuv(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fuv(0.0F)),
         fut.a(0.0F, 0.0F, 0.0F)
      );
      fva $$7 = $$3.a("wind_body", fuw.c(), fut.a(0.0F, 0.0F, 0.0F));
      fva $$8 = $$7.a("wind_bottom", fuw.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fuv(0.0F)), fut.a(0.0F, 24.0F, 0.0F));
      fva $$9 = $$8.a(
         "wind_mid",
         fuw.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fuv(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fuv(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fuv(0.0F)),
         fut.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fuw.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fuv(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fuv(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fuv(0.0F)),
         fut.a(0.0F, -6.0F, 0.0F)
      );
      return fux.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fur::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = axw.b($$6) * 1.0F * 0.6F;
      this.k.d = axw.a($$6) * 1.0F * 0.6F;
      this.l.b = axw.a($$6) * 0.5F * 0.8F;
      this.l.d = axw.b($$6) * 0.8F;
      this.m.b = axw.b($$6) * -0.25F * 1.0F;
      this.m.d = axw.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + axw.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, fdq.a, $$3);
      this.a($$0.c, fdq.c, $$3);
      this.a($$0.d, fdq.d, $$3);
      this.a($$0.e, fdq.b, $$3);
   }

   @Override
   public fur a() {
      return this.g;
   }

   public fur b() {
      return this.h;
   }

   public fur c() {
      return this.i;
   }

   public fur d() {
      return this.n;
   }

   public fur e() {
      return this.j;
   }
}
