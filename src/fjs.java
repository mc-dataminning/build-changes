public class fjs<T extends cds> extends fks<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fnj g;
   private final fnj h;
   private final fnj i;
   private final fnj j;
   private final fnj k;
   private final fnj l;
   private final fnj m;
   private final fnj n;

   public fjs(fnj $$0) {
      super(fub::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fnp a(int $$0, int $$1) {
      fnr $$2 = new fnr();
      fns $$3 = $$2.a();
      fns $$4 = $$3.a("body", fno.c(), fnl.a(0.0F, 0.0F, 0.0F));
      fns $$5 = $$4.a("rods", fno.c(), fnl.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fno.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fnn(0.0F)), fnl.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fno.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fnn(0.0F)), fnl.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fno.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fnn(0.0F)), fnl.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fns $$6 = $$4.a(
         "head",
         fno.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fnn(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(0.0F)),
         fnl.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fno.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fnn(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnn(0.0F)),
         fnl.a(0.0F, 0.0F, 0.0F)
      );
      fns $$7 = $$3.a("wind_body", fno.c(), fnl.a(0.0F, 0.0F, 0.0F));
      fns $$8 = $$7.a("wind_bottom", fno.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fnn(0.0F)), fnl.a(0.0F, 24.0F, 0.0F));
      fns $$9 = $$8.a(
         "wind_mid",
         fno.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fnn(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fnn(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fnn(0.0F)),
         fnl.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fno.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fnn(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fnn(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fnn(0.0F)),
         fnl.a(0.0F, -6.0F, 0.0F)
      );
      return fnp.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fnj::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = aup.b($$6) * 1.0F * 0.6F;
      this.k.d = aup.a($$6) * 1.0F * 0.6F;
      this.l.b = aup.a($$6) * 0.5F * 0.8F;
      this.l.d = aup.b($$6) * 0.8F;
      this.m.b = aup.b($$6) * -0.25F * 1.0F;
      this.m.d = aup.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aup.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bU, ewn.a, $$3);
      this.a($$0.c, ewn.c, $$3);
      this.a($$0.d, ewn.d, $$3);
      this.a($$0.e, ewn.b, $$3);
   }

   @Override
   public fnj a() {
      return this.g;
   }

   public fnj b() {
      return this.h;
   }

   public fnj c() {
      return this.i;
   }

   public fnj d() {
      return this.n;
   }

   public fnj e() {
      return this.j;
   }
}
