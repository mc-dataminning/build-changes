public class fqd<T extends box> extends fon<T> {
   private final frf a;

   public fqd(frf $$0) {
      this.a = $$0;
   }

   public static frl b() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("cube", frk.c().a(0, 0).a(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F), frh.a);
      return frl.a($$0, 64, 32);
   }

   public static frl c() {
      frn $$0 = new frn();
      fro $$1 = $$0.a();
      $$1.a("cube", frk.c().a(0, 16).a(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F), frh.a);
      $$1.a("right_eye", frk.c().a(32, 0).a(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F), frh.a);
      $$1.a("left_eye", frk.c().a(32, 4).a(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F), frh.a);
      $$1.a("mouth", frk.c().a(32, 8).a(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F), frh.a);
      return frl.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public frf a() {
      return this.a;
   }
}
