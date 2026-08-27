public class flk<T extends cfj> extends fmk<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fpc g;
   private final fpc h;
   private final fpc i;
   private final fpc j;
   private final fpc k;
   private final fpc l;
   private final fpc m;
   private final fpc n;

   public flk(fpc $$0) {
      super(fvu::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fpi a(int $$0, int $$1) {
      fpk $$2 = new fpk();
      fpl $$3 = $$2.a();
      fpl $$4 = $$3.a("body", fph.c(), fpe.a(0.0F, 0.0F, 0.0F));
      fpl $$5 = $$4.a("rods", fph.c(), fpe.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fph.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fpg(0.0F)), fpe.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fph.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fpg(0.0F)), fpe.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fph.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fpg(0.0F)), fpe.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fpl $$6 = $$4.a(
         "head",
         fph.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fpg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpg(0.0F)),
         fpe.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fph.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fpg(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpg(0.0F)),
         fpe.a(0.0F, 0.0F, 0.0F)
      );
      fpl $$7 = $$3.a("wind_body", fph.c(), fpe.a(0.0F, 0.0F, 0.0F));
      fpl $$8 = $$7.a("wind_bottom", fph.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fpg(0.0F)), fpe.a(0.0F, 24.0F, 0.0F));
      fpl $$9 = $$8.a(
         "wind_mid",
         fph.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fpg(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fpg(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fpg(0.0F)),
         fpe.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fph.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fpg(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fpg(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fpg(0.0F)),
         fpe.a(0.0F, -6.0F, 0.0F)
      );
      return fpi.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fpc::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = awh.b($$6) * 1.0F * 0.6F;
      this.k.d = awh.a($$6) * 1.0F * 0.6F;
      this.l.b = awh.a($$6) * 0.5F * 0.8F;
      this.l.d = awh.b($$6) * 0.8F;
      this.m.b = awh.b($$6) * -0.25F * 1.0F;
      this.m.d = awh.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + awh.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bT, eyd.a, $$3);
      this.a($$0.c, eyd.c, $$3);
      this.a($$0.d, eyd.d, $$3);
      this.a($$0.e, eyd.b, $$3);
   }

   @Override
   public fpc a() {
      return this.g;
   }

   public fpc b() {
      return this.h;
   }

   public fpc c() {
      return this.i;
   }

   public fpc d() {
      return this.n;
   }

   public fpc e() {
      return this.j;
   }
}
