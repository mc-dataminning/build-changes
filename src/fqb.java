public class fqb extends fqc {
   private final frf b;
   protected final frf a;

   public fqb(frf $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static frn a() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("head", frk.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), frh.a);
      return $$0;
   }

   public static frl b() {
      frn $$0 = a();
      fro $$1 = $$0.a();
      $$1.a("head").a("hat", frk.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new frj(0.25F)), frh.a);
      return frl.a($$0, 64, 64);
   }

   public static frl c() {
      frn $$0 = a();
      return frl.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(eub $$0, euf $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
