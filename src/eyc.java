public class eyc {
   public static final eyc a = new eyc("Merry X-mas!");
   public static final eyc b = new eyc("Happy new year!");
   public static final eyc c = new eyc("OOoooOOOoooo! Spooky!");
   private static final int d = 123;
   private static final int e = 69;
   private final String f;

   public eyc(String $$0) {
      this.f = $$0;
   }

   public void a(ewm $$0, int $$1, ewk $$2, int $$3) {
      $$0.c().a();
      $$0.c().a((float)$$1 / 2.0F + 123.0F, 69.0F, 0.0F);
      $$0.c().a(a.f.rotationDegrees(-20.0F));
      float $$4 = 1.8F - aui.e(aui.a((float)(ac.b() % 1000L) / 1000.0F * (float) (Math.PI * 2)) * 0.1F);
      $$4 = $$4 * 100.0F / (float)($$2.b(this.f) + 32);
      $$0.c().b($$4, $$4, $$4);
      $$0.a($$2, this.f, 0, -8, 16776960 | $$3);
      $$0.c().b();
   }
}
