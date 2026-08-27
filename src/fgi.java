public class fgi<T extends big> extends fet<T> {
   private final fhj a;

   public fgi(fhj $$0) {
      this.a = $$0;
   }

   public static fhp b() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("cube", fho.c().a(0, 0).a(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhl.a);
      return fhp.a($$0, 64, 32);
   }

   public static fhp c() {
      fhr $$0 = new fhr();
      fhs $$1 = $$0.a();
      $$1.a("cube", fho.c().a(0, 16).a(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F), fhl.a);
      $$1.a("right_eye", fho.c().a(32, 0).a(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F), fhl.a);
      $$1.a("left_eye", fho.c().a(32, 4).a(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F), fhl.a);
      $$1.a("mouth", fho.c().a(32, 8).a(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F), fhl.a);
      return fhp.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fhj a() {
      return this.a;
   }
}
