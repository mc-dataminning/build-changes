public class fil<T extends bkv> extends fid<T> {
   private static final String a = "knot";
   private final fkt b;
   private final fkt f;

   public fil(fkt $$0) {
      this.b = $$0;
      this.f = $$0.b("knot");
   }

   public static fkz b() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      $$1.a("knot", fky.c().a(0, 0).a(-3.0F, -8.0F, -3.0F, 6.0F, 8.0F, 6.0F), fkv.a);
      return fkz.a($$0, 32, 32);
   }

   @Override
   public fkt a() {
      return this.b;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = $$5 * (float) (Math.PI / 180.0);
   }
}
