public class flj<T extends blf> extends fjh<T> implements fjg, fli {
   private final fly b;
   private final fly f;
   private final fly g;
   private final fly h;
   private final fly i;
   private final fly j;
   protected final fly a;

   public flj(fly $$0) {
      this.b = $$0;
      this.f = $$0.b("head");
      this.g = this.f.b("hat");
      this.h = this.g.b("hat_rim");
      this.a = this.f.b("nose");
      this.i = $$0.b("right_leg");
      this.j = $$0.b("left_leg");
   }

   public static fmg b() {
      fmg $$0 = new fmg();
      fmh $$1 = $$0.a();
      float $$2 = 0.5F;
      fmh $$3 = $$1.a("head", fmd.c().a(0, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F), fma.a);
      fmh $$4 = $$3.a("hat", fmd.c().a(32, 0).a(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, new fmc(0.51F)), fma.a);
      $$4.a("hat_rim", fmd.c().a(30, 47).a(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F), fma.b((float) (-Math.PI / 2), 0.0F, 0.0F));
      $$3.a("nose", fmd.c().a(24, 0).a(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F), fma.a(0.0F, -2.0F, 0.0F));
      fmh $$5 = $$1.a("body", fmd.c().a(16, 20).a(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F), fma.a);
      $$5.a("jacket", fmd.c().a(0, 38).a(-4.0F, 0.0F, -3.0F, 8.0F, 20.0F, 6.0F, new fmc(0.5F)), fma.a);
      $$1.a(
         "arms",
         fmd.c()
            .a(44, 22)
            .a(-8.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F)
            .a(44, 22)
            .a(4.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, true)
            .a(40, 38)
            .a(-4.0F, 2.0F, -2.0F, 8.0F, 4.0F, 4.0F),
         fma.a(0.0F, 3.0F, -1.0F, -0.75F, 0.0F, 0.0F)
      );
      $$1.a("right_leg", fmd.c().a(0, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fma.a(-2.0F, 12.0F, 0.0F));
      $$1.a("left_leg", fmd.c().a(0, 22).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F), fma.a(2.0F, 12.0F, 0.0F));
      return $$0;
   }

   @Override
   public fly a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      boolean $$6 = false;
      if ($$0 instanceof cdz) {
         $$6 = ((cdz)$$0).u() > 0;
      }

      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
      if ($$6) {
         this.f.g = 0.3F * aty.a(0.45F * $$3);
         this.f.e = 0.4F;
      } else {
         this.f.g = 0.0F;
      }

      this.i.e = aty.b($$1 * 0.6662F) * 1.4F * $$2 * 0.5F;
      this.j.e = aty.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2 * 0.5F;
      this.i.f = 0.0F;
      this.j.f = 0.0F;
   }

   @Override
   public fly d() {
      return this.f;
   }

   @Override
   public void a(boolean $$0) {
      this.f.k = $$0;
      this.g.k = $$0;
      this.h.k = $$0;
   }
}
