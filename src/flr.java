public class flr<T extends cfn> extends fmr<T> {
   private static final float a = 0.6F;
   private static final float b = 0.8F;
   private static final float f = 1.0F;
   private final fpj g;
   private final fpj h;
   private final fpj i;
   private final fpj j;
   private final fpj k;
   private final fpj l;
   private final fpj m;
   private final fpj n;

   public flr(fpj $$0) {
      super(fwb::i);
      this.g = $$0;
      this.j = $$0.b("wind_body");
      this.m = this.j.b("wind_bottom");
      this.l = this.m.b("wind_mid");
      this.k = this.l.b("wind_top");
      this.h = $$0.b("body").b("head");
      this.i = this.h.b("eyes");
      this.n = $$0.b("body").b("rods");
   }

   public static fpp a(int $$0, int $$1) {
      fpr $$2 = new fpr();
      fps $$3 = $$2.a();
      fps $$4 = $$3.a("body", fpo.c(), fpl.a(0.0F, 0.0F, 0.0F));
      fps $$5 = $$4.a("rods", fpo.c(), fpl.a(0.0F, 8.0F, 0.0F));
      $$5.a("rod_1", fpo.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fpn(0.0F)), fpl.a(2.5981F, -3.0F, 1.5F, -2.7489F, -1.0472F, 3.1416F));
      $$5.a("rod_2", fpo.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fpn(0.0F)), fpl.a(-2.5981F, -3.0F, 1.5F, -2.7489F, 1.0472F, 3.1416F));
      $$5.a("rod_3", fpo.c().a(0, 17).a(-1.0F, 0.0F, -3.0F, 2.0F, 8.0F, 2.0F, new fpn(0.0F)), fpl.a(0.0F, -3.0F, -3.0F, 0.3927F, 0.0F, 0.0F));
      fps $$6 = $$4.a(
         "head",
         fpo.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fpn(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpn(0.0F)),
         fpl.a(0.0F, 4.0F, 0.0F)
      );
      $$6.a(
         "eyes",
         fpo.c().a(4, 24).a(-5.0F, -5.0F, -4.2F, 10.0F, 3.0F, 4.0F, new fpn(0.0F)).a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fpn(0.0F)),
         fpl.a(0.0F, 0.0F, 0.0F)
      );
      fps $$7 = $$3.a("wind_body", fpo.c(), fpl.a(0.0F, 0.0F, 0.0F));
      fps $$8 = $$7.a("wind_bottom", fpo.c().a(1, 83).a(-2.5F, -7.0F, -2.5F, 5.0F, 7.0F, 5.0F, new fpn(0.0F)), fpl.a(0.0F, 24.0F, 0.0F));
      fps $$9 = $$8.a(
         "wind_mid",
         fpo.c()
            .a(74, 28)
            .a(-6.0F, -6.0F, -6.0F, 12.0F, 6.0F, 12.0F, new fpn(0.0F))
            .a(78, 32)
            .a(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F, new fpn(0.0F))
            .a(49, 71)
            .a(-2.5F, -6.0F, -2.5F, 5.0F, 6.0F, 5.0F, new fpn(0.0F)),
         fpl.a(0.0F, -7.0F, 0.0F)
      );
      $$9.a(
         "wind_top",
         fpo.c()
            .a(0, 0)
            .a(-9.0F, -8.0F, -9.0F, 18.0F, 8.0F, 18.0F, new fpn(0.0F))
            .a(6, 6)
            .a(-6.0F, -8.0F, -6.0F, 12.0F, 8.0F, 12.0F, new fpn(0.0F))
            .a(105, 57)
            .a(-2.5F, -8.0F, -2.5F, 5.0F, 8.0F, 5.0F, new fpn(0.0F)),
         fpl.a(0.0F, -6.0F, 0.0F)
      );
      return fpp.a($$2, $$0, $$1);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fpj::c);
      float $$6 = $$3 * (float) Math.PI * -0.1F;
      this.k.b = awi.b($$6) * 1.0F * 0.6F;
      this.k.d = awi.a($$6) * 1.0F * 0.6F;
      this.l.b = awi.a($$6) * 0.5F * 0.8F;
      this.l.d = awi.b($$6) * 0.8F;
      this.m.b = awi.b($$6) * -0.25F * 1.0F;
      this.m.d = awi.a($$6) * -0.25F * 1.0F;
      this.h.c = 4.0F + awi.b($$6) / 4.0F;
      this.n.f = $$3 * (float) Math.PI * 0.1F;
      this.a($$0.bT, eyk.a, $$3);
      this.a($$0.c, eyk.c, $$3);
      this.a($$0.d, eyk.d, $$3);
      this.a($$0.e, eyk.b, $$3);
   }

   @Override
   public fpj a() {
      return this.g;
   }

   public fpj b() {
      return this.h;
   }

   public fpj c() {
      return this.i;
   }

   public fpj d() {
      return this.n;
   }

   public fpj e() {
      return this.j;
   }
}
