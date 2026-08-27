public class fjl extends fjm {
   private final fko b;
   protected final fko a;

   public fjl(fko $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fkw a() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("head", fkt.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkq.a);
      return $$0;
   }

   public static fku b() {
      fkw $$0 = a();
      fkx $$1 = $$0.a();
      $$1.a("head").a("hat", fkt.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fks(0.25F)), fkq.a);
      return fku.a($$0, 64, 64);
   }

   public static fku c() {
      fkw $$0 = a();
      return fku.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(enw $$0, eoa $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
