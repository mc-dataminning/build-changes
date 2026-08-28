public class ftr<T extends ckj> extends fur<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fxi g;
   private final fxi h;
   private final fxi i;
   private final fxi j;
   private final fxi k;
   private final fxi l;
   private final fxi m;
   private final fxi n;

   public ftr(fxi $$0) {
      super(gef::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fxo a(int $$0, int $$1) {
      fxq $$2 = new fxq();
      fxr $$3 = $$2.a();
      fxr $$4 = $$3.a("body", fxn.c(), fxk.a(0.0F, 0.0F, 0.0F));
      fxr $$5 = $$4.a("rods", fxn.c(), fxk.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fxn.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxm(0.0F)), fxk.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fxn.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxm(0.0F)), fxk.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fxn.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fxm(0.0F)), fxk.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fxr $$6 = $$4.a(
         "head",
         fxn.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxm(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxm(0.0F)),
         fxk.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fxn.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fxm(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fxm(0.0F)),
         fxk.a(0.0F, 0.0F, 0.0F)
      );
      fxr $$7 = $$3.a("wind_body", fxn.c(), fxk.a(0.0F, 0.0F, 0.0F));
      fxr $$8 = $$7.a("wind_bottom", fxn.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fxm(0.0F)), fxk.a(0.0F, 24.0F, 0.0F));
      fxr $$9 = $$8.a(
         "wind_mid",
         fxn.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fxm(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fxm(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fxm(0.0F)),
         fxk.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fxn.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fxm(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fxm(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fxm(0.0F)),
         fxk.a(0.0F, -6.0F, 0.0F)
      );
      return fxo.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxi::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = aye.b($$6) * 1.0F * 0.6F;
      this.k.d = aye.a($$6) * 1.0F * 0.6F;
      this.l.b = aye.a($$6) * 0.5F * 0.8F;
      this.l.d = aye.b($$6) * 0.8F;
      this.m.b = aye.b($$6) * -0.25F * 1.0F;
      this.m.d = aye.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + aye.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.ca, fgi.a, $$3);
      this.a($$0.c, fgi.c, $$3);
      this.a($$0.d, fgi.d, $$3);
      this.a($$0.e, fgi.b, $$3);
   }

   @Override
   public fxi a() {
      return this.g;
   }

   public fxi b() {
      return this.h;
   }

   public fxi c() {
      return this.i;
   }

   public fxi d() {
      return this.n;
   }

   public fxi e() {
      return this.j;
   }
}
