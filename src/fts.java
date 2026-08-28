public class fts<T extends bss> extends fuh<T> {
   private final fwy a;
   private final fwy b;
   private final fwy f;
   private final fwy g;
   private final fwy h;
   private final fwy i;
   private static final int j = 6;

   public fts(fwy $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fxe a(fxc $$0) {
      fxg $$1 = new fxg();
      fxh $$2 = $$1.a();
      $$2.a("head", fxd.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fxa.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fxd.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fxa.a(0.0F, 6.0F, 0.0F));
      fxd $$3 = fxd.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fxa.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fxa.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fxa.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fxa.a(2.0F, 18.0F, -4.0F));
      return fxe.a($$1, 64, 32);
   }

   @Override
   public fwy a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = ayx.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = ayx.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = ayx.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = ayx.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
