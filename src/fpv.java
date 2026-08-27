public class fpv<T extends chv> extends fqv<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final ftm g;
   private final ftm h;
   private final ftm i;
   private final ftm j;
   private final ftm k;
   private final ftm l;
   private final ftm m;
   private final ftm n;

   public fpv(ftm $$0) {
      super(gah::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fts a(int $$0, int $$1) {
      ftu $$2 = new ftu();
      ftv $$3 = $$2.a();
      ftv $$4 = $$3.a("body", ftr.c(), fto.a(0.0F, 0.0F, 0.0F));
      ftv $$5 = $$4.a("rods", ftr.c(), fto.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", ftr.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ftq(0.0F)), fto.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", ftr.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ftq(0.0F)), fto.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", ftr.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new ftq(0.0F)), fto.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      ftv $$6 = $$4.a(
         "head",
         ftr.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ftq(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ftq(0.0F)),
         fto.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         ftr.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new ftq(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new ftq(0.0F)),
         fto.a(0.0F, 0.0F, 0.0F)
      );
      ftv $$7 = $$3.a("wind_body", ftr.c(), fto.a(0.0F, 0.0F, 0.0F));
      ftv $$8 = $$7.a("wind_bottom", ftr.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new ftq(0.0F)), fto.a(0.0F, 24.0F, 0.0F));
      ftv $$9 = $$8.a(
         "wind_mid",
         ftr.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new ftq(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new ftq(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new ftq(0.0F)),
         fto.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         ftr.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new ftq(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new ftq(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new ftq(0.0F)),
         fto.a(0.0F, -6.0F, 0.0F)
      );
      return fts.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(ftm::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = axk.b($$6) * 1.0F * 0.6F;
      this.k.d = axk.a($$6) * 1.0F * 0.6F;
      this.l.b = axk.a($$6) * 0.5F * 0.8F;
      this.l.d = axk.b($$6) * 0.8F;
      this.m.b = axk.b($$6) * -0.25F * 1.0F;
      this.m.d = axk.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + axk.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bX, fcl.a, $$3);
      this.a($$0.c, fcl.c, $$3);
      this.a($$0.d, fcl.d, $$3);
      this.a($$0.e, fcl.b, $$3);
   }

   @Override
   public ftm a() {
      return this.g;
   }

   public ftm b() {
      return this.h;
   }

   public ftm c() {
      return this.i;
   }

   public ftm d() {
      return this.n;
   }

   public ftm e() {
      return this.j;
   }
}
