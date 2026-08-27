public class fnl<T extends cgu> extends fol<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final frd g;
   private final frd h;
   private final frd i;
   private final frd j;
   private final frd k;
   private final frd l;
   private final frd m;
   private final frd n;

   public fnl(frd $$0) {
      super(fxy::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static frj a(int $$0, int $$1) {
      frl $$2 = new frl();
      frm $$3 = $$2.a();
      frm $$4 = $$3.a("body", fri.c(), frf.a(0.0F, 0.0F, 0.0F));
      frm $$5 = $$4.a("rods", fri.c(), frf.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fri.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new frh(0.0F)), frf.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fri.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new frh(0.0F)), frf.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fri.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new frh(0.0F)), frf.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      frm $$6 = $$4.a(
         "head",
         fri.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new frh(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new frh(0.0F)),
         frf.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fri.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new frh(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new frh(0.0F)),
         frf.a(0.0F, 0.0F, 0.0F)
      );
      frm $$7 = $$3.a("wind_body", fri.c(), frf.a(0.0F, 0.0F, 0.0F));
      frm $$8 = $$7.a("wind_bottom", fri.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new frh(0.0F)), frf.a(0.0F, 24.0F, 0.0F));
      frm $$9 = $$8.a(
         "wind_mid",
         fri.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new frh(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new frh(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new frh(0.0F)),
         frf.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fri.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new frh(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new frh(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new frh(0.0F)),
         frf.a(0.0F, -6.0F, 0.0F)
      );
      return frj.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(frd::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = aww.b($$6) * 1.0F * 0.6F;
      this.k.d = aww.a($$6) * 1.0F * 0.6F;
      this.l.b = aww.a($$6) * 0.5F * 0.8F;
      this.l.d = aww.b($$6) * 0.8F;
      this.m.b = aww.b($$6) * -0.25F * 1.0F;
      this.m.d = aww.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aww.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bX, fac.a, $$3);
      this.a($$0.c, fac.c, $$3);
      this.a($$0.d, fac.d, $$3);
      this.a($$0.e, fac.b, $$3);
   }

   @Override
   public frd a() {
      return this.g;
   }

   public frd b() {
      return this.h;
   }

   public frd c() {
      return this.i;
   }

   public frd d() {
      return this.n;
   }

   public frd e() {
      return this.j;
   }
}
