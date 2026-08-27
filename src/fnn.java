public class fnn<T extends cgw> extends fon<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final frf g;
   private final frf h;
   private final frf i;
   private final frf j;
   private final frf k;
   private final frf l;
   private final frf m;
   private final frf n;

   public fnn(frf $$0) {
      super(fya::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static frl a(int $$0, int $$1) {
      frn $$2 = new frn();
      fro $$3 = $$2.a();
      fro $$4 = $$3.a("body", frk.c(), frh.a(0.0F, 0.0F, 0.0F));
      fro $$5 = $$4.a("rods", frk.c(), frh.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", frk.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new frj(0.0F)), frh.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", frk.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new frj(0.0F)), frh.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", frk.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new frj(0.0F)), frh.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fro $$6 = $$4.a(
         "head",
         frk.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new frj(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new frj(0.0F)),
         frh.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         frk.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new frj(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new frj(0.0F)),
         frh.a(0.0F, 0.0F, 0.0F)
      );
      fro $$7 = $$3.a("wind_body", frk.c(), frh.a(0.0F, 0.0F, 0.0F));
      fro $$8 = $$7.a("wind_bottom", frk.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new frj(0.0F)), frh.a(0.0F, 24.0F, 0.0F));
      fro $$9 = $$8.a(
         "wind_mid",
         frk.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new frj(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new frj(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new frj(0.0F)),
         frh.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         frk.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new frj(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new frj(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new frj(0.0F)),
         frh.a(0.0F, -6.0F, 0.0F)
      );
      return frl.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frf::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = aww.b($$6) * 1.0F * 0.6F;
      this.k.d = aww.a($$6) * 1.0F * 0.6F;
      this.l.b = aww.a($$6) * 0.5F * 0.8F;
      this.l.d = aww.b($$6) * 0.8F;
      this.m.b = aww.b($$6) * -0.25F * 1.0F;
      this.m.d = aww.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aww.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bX, fae.a, $$3);
      this.a($$0.c, fae.c, $$3);
      this.a($$0.d, fae.d, $$3);
      this.a($$0.e, fae.b, $$3);
   }

   @Override
   public frf a() {
      return this.g;
   }

   public frf b() {
      return this.h;
   }

   public frf c() {
      return this.i;
   }

   public frf d() {
      return this.n;
   }

   public frf e() {
      return this.j;
   }
}
