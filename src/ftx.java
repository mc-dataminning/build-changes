public class ftx<T extends ckm> extends fux<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fxo g;
   private final fxo h;
   private final fxo i;
   private final fxo j;
   private final fxo k;
   private final fxo l;
   private final fxo m;
   private final fxo n;

   public ftx(fxo $$0) {
      super(gel::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxu a(int $$0, int $$1) {
      fxw $$2 = new fxw();
      fxx $$3 = $$2.a();
      fxx $$4 = $$3.a("body", fxt.c(), fxq.a(0.0F, 0.0F, 0.0F));
      fxx $$5 = $$4.a("rods", fxt.c(), fxq.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxt.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxs(0.0F)), fxq.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxt.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxs(0.0F)), fxq.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxt.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxs(0.0F)), fxq.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxx $$6 = $$4.a(
         "head",
         fxt.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxs(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxs(0.0F)),
         fxq.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxt.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxs(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxs(0.0F)),
         fxq.a(0.0F, 0.0F, 0.0F)
      );
      fxx $$7 = $$3.a("wind_body", fxt.c(), fxq.a(0.0F, 0.0F, 0.0F));
      fxx $$8 = $$7.a("wind_bottom", fxt.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxs(0.0F)), fxq.a(0.0F, 24.0F, 0.0F));
      fxx $$9 = $$8.a(
         "wind_mid",
         fxt.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxs(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxs(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxs(0.0F)),
         fxq.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxt.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxs(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxs(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxs(0.0F)),
         fxq.a(0.0F, -6.0F, 0.0F)
      );
      return fxu.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxo::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayg.b($$6) * 1.0F * 0.6F;
      this.k.d = ayg.a($$6) * 1.0F * 0.6F;
      this.l.b = ayg.a($$6) * 0.5F * 0.8F;
      this.l.d = ayg.b($$6) * 0.8F;
      this.m.b = ayg.b($$6) * -0.25F * 1.0F;
      this.m.d = ayg.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayg.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ca, fgo.a, $$3);
      this.a($$0.c, fgo.c, $$3);
      this.a($$0.d, fgo.d, $$3);
      this.a($$0.e, fgo.b, $$3);
   }

   @Override
   public fxo a() {
      return this.g;
   }

   public fxo b() {
      return this.h;
   }

   public fxo c() {
      return this.i;
   }

   public fxo d() {
      return this.n;
   }

   public fxo e() {
      return this.j;
   }
}
