public class fho<T extends bkv> extends fid<T> {
   private final fkt a;
   private final fkt b;
   private final fkt f;
   private final fkt g;
   private final fkt h;
   private final fkt i;
   private static final int j = 6;

   public fho(fkt $$0) {
      this.a = $$0;
      this.b = $$0.b("head");
      this.g = $$0.b("right_hind_leg");
      this.f = $$0.b("left_hind_leg");
      this.i = $$0.b("right_front_leg");
      this.h = $$0.b("left_front_leg");
   }

   public static fkz a(fkx $$0) {
      flb $$1 = new flb();
      flc $$2 = $$1.a();
      $$2.a("head", fky.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fkv.a(0.0F, 6.0F, 0.0F));
      $$2.a("body", fky.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), fkv.a(0.0F, 6.0F, 0.0F));
      fky $$3 = fky.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$3, fkv.a(-2.0F, 18.0F, 4.0F));
      $$2.a("left_hind_leg", $$3, fkv.a(2.0F, 18.0F, 4.0F));
      $$2.a("right_front_leg", $$3, fkv.a(-2.0F, 18.0F, -4.0F));
      $$2.a("left_front_leg", $$3, fkv.a(2.0F, 18.0F, -4.0F));
      return fkz.a($$1, 64, 32);
   }

   @Override
   public fkt a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.f.e = atq.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = atq.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = atq.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = atq.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
