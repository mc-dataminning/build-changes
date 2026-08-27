public class fee<T extends big> extends fet<T> {
   private final fhj a;
   private final fhj b;
   private final fhj f;
   private final fhj g;
   private final fhj h;
   private final fhj i;
   private static final int j = 6;

   public fee(fhj $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fhp a(fhn $$0) {
      fhr $$1 = new fhr();
      fhs $$2 = $$1.a();
      $$2.a("head", fho.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fhl.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fho.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fhl.a(0.0F, 6.0F, 0.0F));
      fho $$3 = fho.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fhl.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fhl.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fhl.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fhl.a(2.0F, 18.0F, -4.0F));
      return fhp.a($$1, 64, 32);
   }

   @Override
   public fhj a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = aro.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = aro.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = aro.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = aro.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
