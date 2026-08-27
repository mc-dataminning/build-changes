public class fgu<T extends bii> extends feg<T> {
   private final fhn a;
   private final fhn b;

   public fgu(fhn $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fht a(fhr $$0) {
      fhv $$1 = new fhv();
      fhw $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", fhs.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), fhp.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", fhs.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fhp.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", fhs.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fhp.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fhs.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fhp.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fhs.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fhp.a(0.0F, 20.5F, -3.0F));
      return fht.a($$1, 32, 32);
   }

   @Override
   public fhn a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aX()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * arp.a(0.6F * $$3);
   }
}
