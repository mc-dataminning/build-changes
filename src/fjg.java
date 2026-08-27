public class fjg<T extends cdl> extends fkg<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fmx g;
   private final fmx h;
   private final fmx i;
   private final fmx j;
   private final fmx k;
   private final fmx l;
   private final fmx m;

   public fjg(fmx $$0) {
      super(ftp::i);
      this.g = $$0;
      this.i = $$0.b("wind_body");
      this.l = this.i.b("wind_bottom");
      this.k = this.l.b("wind_mid");
      this.j = this.k.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.m = $$0.b("body").b("rods");
   }

   public static fnd b() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a("body", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$3 = $$2.a("rods", fnc.c(), fmz.a(0.0F, 8.0F, 0.0F));
      $$3.a("rod_1", fnc.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fnb(0.0F)), fmz.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$3.a("rod_2", fnc.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fnb(0.0F)), fmz.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$3.a("rod_3", fnc.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fnb(0.0F)), fmz.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fng $$4 = $$2.a("head", fnc.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fnb(0.0F)), fmz.a(0.0F, 4.0F, 0.0F));
      fng $$5 = $$1.a("wind_body", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$6 = $$5.a("wind_bottom", fnc.c(), fmz.a(0.0F, 24.0F, 0.0F));
      fng $$7 = $$6.a("wind_mid", fnc.c(), fmz.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fnc.c(), fmz.a(0.0F, -6.0F, 0.0F));
      return fnd.a($$0, 32, 32);
   }

   public static fnd c() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a("body", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$3 = $$2.a("rods", fnc.c(), fmz.a(0.0F, 8.0F, 0.0F));
      fng $$4 = $$2.a("head", fnc.c(), fmz.a(0.0F, 4.0F, 0.0F));
      $$4.a(
         "eyes",
         fnc.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fnb(0.0F)).a(7, 16).a(-4.0F, -2.0F, -4.0F, 8.0F, 1.0F, 1.0F, new fnb(0.0F)),
         fmz.a(0.0F, 0.0F, 0.0F)
      );
      fng $$5 = $$1.a("wind_body", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$6 = $$5.a("wind_bottom", fnc.c(), fmz.a(0.0F, 24.0F, 0.0F));
      fng $$7 = $$6.a("wind_mid", fnc.c(), fmz.a(0.0F, -7.0F, 0.0F));
      $$7.a("wind_top", fnc.c(), fmz.a(0.0F, -6.0F, 0.0F));
      return fnd.a($$0, 32, 32);
   }

   public static fnd d() {
      fnf $$0 = new fnf();
      fng $$1 = $$0.a();
      fng $$2 = $$1.a("body", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$3 = $$2.a("rods", fnc.c(), fmz.a(0.0F, 8.0F, 0.0F));
      $$2.a("head", fnc.c(), fmz.a(0.0F, 4.0F, 0.0F));
      fng $$4 = $$1.a("wind_body", fnc.c(), fmz.a(0.0F, 0.0F, 0.0F));
      fng $$5 = $$4.a("wind_bottom", fnc.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fnb(0.0F)), fmz.a(0.0F, 24.0F, 0.0F));
      fng $$6 = $$5.a(
         "wind_mid",
         fnc.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fnb(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fnb(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fnb(0.0F)),
         fmz.a(0.0F, -7.0F, 0.0F)
      );
      $$6.a(
         "wind_top",
         fnc.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fnb(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fnb(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fnb(0.0F)),
         fmz.a(0.0F, -6.0F, 0.0F)
      );
      return fnd.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fmx::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.j.b = auo.b($$6) * 1.0F * 0.6F;
      this.j.d = auo.a($$6) * 1.0F * 0.6F;
      this.k.b = auo.a($$6) * 0.5F * 0.8F;
      this.k.d = auo.b($$6) * 0.8F;
      this.l.b = auo.b($$6) * -0.25F * 1.0F;
      this.l.d = auo.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + auo.b($$6) / 4.0F;
      this.m.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.e, ewd.a, $$3);
      this.a($$0.c, ewd.c, $$3);
      this.a($$0.d, ewd.b, $$3);
   }

   @Override
   public fmx a() {
      return this.g;
   }

   public fmx e() {
      return this.j;
   }

   public fmx f() {
      return this.k;
   }

   public fmx g() {
      return this.l;
   }
}
