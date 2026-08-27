public class ftg<T extends bqa> extends fre<T> implements frd, ftf {
   private final ftv b;
   private final ftv f;
   private final ftv g;
   private final ftv h;
   private final ftv i;
   private final ftv j;
   protected final ftv a;

   public ftg(ftv $$0) {
      this.b = $$0;
      this.f = $$0.b("head");
      this.g = this.f.b("hat");
      this.h = this.g.b("hat_rim");
      this.a = this.f.b("nose");
      this.i = $$0.b("right_leg");
      this.j = $$0.b("left_leg");
   }

   public static fud b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      float $$2 = 0.5F;
      fue $$3 = $$1.a("head", fua.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), ftx.a);
      fue $$4 = $$3.a("hat", fua.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new ftz(0.51F)), ftx.a);
      $$4.a("hat_rim", fua.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), ftx.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", fua.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), ftx.a(0.0F, -2.0F, 0.0F));
      fue $$5 = $$1.a("body", fua.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), ftx.a);
      $$5.a("jacket", fua.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new ftz(0.5F)), ftx.a);
      $$1.a(
         "arms",
         fua.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         ftx.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", fua.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ftx.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fua.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), ftx.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   @Override
   public ftv a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      boolean $$6 = false;
      if ($$0 instanceof cji) {
         $$6 = ((cji)$$0).r() > 0;
      }

      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
      if ($$6) {
         this.f.g = 0.3F * axm.a(0.45F * $$3);
         this.f.e = 0.4F;
      } else {
         this.f.g = 0.0F;
      }

      this.i.e = axm.b($$1 * 0.6662F) * 1.4F * $$2 * 0.5F;
      this.j.e = axm.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2 * 0.5F;
      this.i.f = 0.0F;
      this.j.f = 0.0F;
   }

   @Override
   public ftv d() {
      return this.f;
   }

   @Override
   public void a(boolean $$0) {
      this.f.k = $$0;
      this.g.k = $$0;
      this.h.k = $$0;
   }
}
