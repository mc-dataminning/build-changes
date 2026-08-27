public class ftn extends fto {
   private final fur b;
   protected final fur a;

   public ftn(fur $$0) {
      this.b = $$0;
      this.a = $$0.b("head");
   }

   public static fuz a() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("head", fuw.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), fut.a);
      return $$0;
   }

   public static fux b() {
      fuz $$0 = a();
      fva $$1 = $$0.a();
      $$1.a("head").a("hat", fuw.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new fuv(0.25F)), fut.a);
      return fux.a($$0, 64, 64);
   }

   public static fux c() {
      fuz $$0 = a();
      return fux.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(exn $$0, exr $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }
}
