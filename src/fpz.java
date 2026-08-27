public class fpz extends fqa {
   private final frd b;
   protected final frd a;

   public fpz(frd $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static frl a() {
      frl $$0 = new frl();
      frm $$1 = $$0.a();
      $$1.a("head", fri.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), frf.a);
      return $$0;
   }

   public static frj b() {
      frl $$0 = a();
      frm $$1 = $$0.a();
      $$1.a("head").a("hat", fri.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new frh(0.25F)), frf.a);
      return frj.a($$0, 64, 64);
   }

   public static frj c() {
      frl $$0 = a();
      return frj.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(etz $$0, eud $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
