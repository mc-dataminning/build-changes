public class fjv extends fiz {
   private final fkb a;
   private final fkb b;

   public fjv(fkb $$0) {
      this.a = $$0.b("head");
      this.b = this.a.b("jaw");
   }

   public static fkh a() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      float $$2 = -16.0F;
      fkk $$3 = $$1.a(
         "head",
         fkg.c()
            .a("upper_lip", -6.0F, -1.0F, -24.0F, 12, 5, 16, 176, 44)
            .a("upper_head", -8.0F, -8.0F, -10.0F, 16, 16, 16, 112, 30)
            .a(true)
            .a("scale", -5.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", -5.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0)
            .a(false)
            .a("scale", 3.0F, -12.0F, -4.0F, 2, 4, 6, 0, 0)
            .a("nostril", 3.0F, -3.0F, -22.0F, 2, 2, 4, 112, 0),
         fkd.a
      );
      $$3.a("jaw", fkg.c().a(176, 65).a("jaw", -6.0F, 0.0F, -16.0F, 12.0F, 4.0F, 16.0F), fkd.a(0.0F, 4.0F, -8.0F));
      return fkh.a($$0, 256, 256);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.b.e = (float)(Math.sin((double)($$0 * (float) Math.PI * 0.2F)) + 1.0) * 0.2F;
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }

   @Override
   public void a(enk $$0, eno $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      $$0.a();
      $$0.a(0.0F, -0.374375F, 0.0F);
      $$0.b(0.75F, 0.75F, 0.75F);
      this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      $$0.b();
   }
}
