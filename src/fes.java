public class fes<T extends bil> extends ffh<T> {
   private final fhx a;
   private final fhx b;
   private final fhx f;
   private final fhx g;
   private final fhx h;
   private final fhx i;
   private static final int j = 6;

   public fes(fhx $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fid a(fib $$0) {
      fif $$1 = new fif();
      fig $$2 = $$1.a();
      $$2.a("head", fic.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fhz.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fic.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fhz.a(0.0F, 6.0F, 0.0F));
      fic $$3 = fic.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fhz.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fhz.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fhz.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fhz.a(2.0F, 18.0F, -4.0F));
      return fid.a($$1, 64, 32);
   }

   @Override
   public fhx a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
