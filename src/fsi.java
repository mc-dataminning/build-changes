public class fsi<T extends bql> extends fsa<T> {
   private static final String a = "knot";
   private final fur b;
   private final fur f;

   public fsi(fur $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      $$1.a("knot", fuw.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fut.a);
      return fux.a($$0, 32, 32);
   }

   @Override
   public fur a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
