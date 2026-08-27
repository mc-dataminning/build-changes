public class fee<T extends bii> extends fex<T> {
   private final fhn a;
   private final fhn b;

   public fee(fhn $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fht b() {
      fhv $$0 = new fhv();
      fhw $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fhs.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fhp.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fhs.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fhp.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fhs.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fhp.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fhs.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fhp.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fhs.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fhp.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fhs.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fhp.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fhs.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fhp.a(0.0F, 20.0F, 0.0F));
      return fht.a($$0, 32, 32);
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
