public class fje<T extends cdk> extends fke<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fmv g;
   private final fmv h;
   private final fmv i;
   private final fmv j;
   private final fmv k;
   private final fmv l;
   private final fmv m;

   public fje(fmv $$0) {
      super(ftn::i);
      this.g = $$0;
      this.i = $$0.b("wind_body");
      this.l = this.i.b("wind_bottom");
      this.k = this.l.b("wind_mid");
      this.j = this.k.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.m = $$0.b("body").b("rods");
   }

   public static fnb b() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("body", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$3 = $$2.a("rods", fna.c(), fmx.a(0.0F, 8.0F, 0.0F));
      $$3.a("rod_1", fna.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmz(0.0F)), fmx.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$3.a("rod_2", fna.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmz(0.0F)), fmx.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$3.a("rod_3", fna.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fmz(0.0F)), fmx.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fne $$4 = $$2.a("head", fna.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fmz(0.0F)), fmx.a(0.0F, 4.0F, 0.0F));
      fne $$5 = $$1.a("wind_body", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$6 = $$5.a("wind_bottom", fna.c(), fmx.a(0.0F, 24.0F, 0.0F));
      fne $$7 = $$6.a("wind_mid", fna.c(), fmx.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fna.c(), fmx.a(0.0F, -6.0F, 0.0F));
      return fnb.a($$0, 32, 32);
   }

   public static fnb c() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("body", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$3 = $$2.a("rods", fna.c(), fmx.a(0.0F, 8.0F, 0.0F));
      fne $$4 = $$2.a("head", fna.c(), fmx.a(0.0F, 4.0F, 0.0F));
      $$4.a(
         "eyes",
         fna.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fmz(0.0F)).a(7, 16).a(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 1.0F, new fmz(0.0F)),
         fmx.a(0.0F, 0.0F, 0.0F)
      );
      fne $$5 = $$1.a("wind_body", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$6 = $$5.a("wind_bottom", fna.c(), fmx.a(0.0F, 24.0F, 0.0F));
      fne $$7 = $$6.a("wind_mid", fna.c(), fmx.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fna.c(), fmx.a(0.0F, -6.0F, 0.0F));
      return fnb.a($$0, 32, 32);
   }

   public static fnb d() {
      fnd $$0 = new fnd();
      fne $$1 = $$0.a();
      fne $$2 = $$1.a("body", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$3 = $$2.a("rods", fna.c(), fmx.a(0.0F, 8.0F, 0.0F));
      $$2.a("head", fna.c(), fmx.a(0.0F, 4.0F, 0.0F));
      fne $$4 = $$1.a("wind_body", fna.c(), fmx.a(0.0F, 0.0F, 0.0F));
      fne $$5 = $$4.a("wind_bottom", fna.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fmz(0.0F)), fmx.a(0.0F, 24.0F, 0.0F));
      fne $$6 = $$5.a(
         "wind_mid",
         fna.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fmz(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fmz(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fmz(0.0F)),
         fmx.a(0.0F, -7.0F, 0.0F)
      );
      $$6.a(
         "wind_top",
         fna.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fmz(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fmz(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fmz(0.0F)),
         fmx.a(0.0F, -6.0F, 0.0F)
      );
      return fnb.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmv::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.j.b = aun.b($$6) * 1.0F * 0.6F;
      this.j.d = aun.a($$6) * 1.0F * 0.6F;
      this.k.b = aun.a($$6) * 0.5F * 0.8F;
      this.k.d = aun.b($$6) * 0.8F;
      this.l.b = aun.b($$6) * -0.25F * 1.0F;
      this.l.d = aun.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aun.b($$6) / 4.0F;
      this.m.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.e, ewb.a, $$3);
      this.a($$0.c, ewb.c, $$3);
      this.a($$0.d, ewb.b, $$3);
   }

   @Override
   public fmv a() {
      return this.g;
   }

   public fmv e() {
      return this.j;
   }

   public fmv f() {
      return this.k;
   }

   public fmv g() {
      return this.l;
   }
}
