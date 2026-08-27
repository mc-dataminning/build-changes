public class fsf<T extends cjy> extends ftf<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fvw g;
   private final fvw h;
   private final fvw i;
   private final fvw j;
   private final fvw k;
   private final fvw l;
   private final fvw m;
   private final fvw n;

   public fsf(fvw $$0) {
      super(gcs::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fwc a(int $$0, int $$1) {
      fwe $$2 = new fwe();
      fwf $$3 = $$2.a();
      fwf $$4 = $$3.a("body", fwb.c(), fvy.a(0.0F, 0.0F, 0.0F));
      fwf $$5 = $$4.a("rods", fwb.c(), fvy.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fwb.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fwa(0.0F)), fvy.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fwb.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fwa(0.0F)), fvy.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fwb.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fwa(0.0F)), fvy.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fwf $$6 = $$4.a(
         "head",
         fwb.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fwa(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fwa(0.0F)),
         fvy.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fwb.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fwa(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fwa(0.0F)),
         fvy.a(0.0F, 0.0F, 0.0F)
      );
      fwf $$7 = $$3.a("wind_body", fwb.c(), fvy.a(0.0F, 0.0F, 0.0F));
      fwf $$8 = $$7.a("wind_bottom", fwb.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fwa(0.0F)), fvy.a(0.0F, 24.0F, 0.0F));
      fwf $$9 = $$8.a(
         "wind_mid",
         fwb.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fwa(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fwa(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fwa(0.0F)),
         fvy.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fwb.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fwa(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fwa(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fwa(0.0F)),
         fvy.a(0.0F, -6.0F, 0.0F)
      );
      return fwc.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fvw::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = ayd.b($$6) * 1.0F * 0.6F;
      this.k.d = ayd.a($$6) * 1.0F * 0.6F;
      this.l.b = ayd.a($$6) * 0.5F * 0.8F;
      this.l.d = ayd.b($$6) * 0.8F;
      this.m.b = ayd.b($$6) * -0.25F * 1.0F;
      this.m.d = ayd.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + ayd.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bY, fev.a, $$3);
      this.a($$0.c, fev.c, $$3);
      this.a($$0.d, fev.d, $$3);
      this.a($$0.e, fev.b, $$3);
   }

   @Override
   public fvw a() {
      return this.g;
   }

   public fvw b() {
      return this.h;
   }

   public fvw c() {
      return this.i;
   }

   public fvw d() {
      return this.n;
   }

   public fvw e() {
      return this.j;
   }
}
