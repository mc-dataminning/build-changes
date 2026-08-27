public class fgs<T extends bki> extends fhl<T> {
   private final fkb a;
   private final fkb b;

   public fgs(fkb $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fkh b() {
      fkj $$0 = new fkj();
      fkk $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fkg.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), fkd.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fkg.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), fkd.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fkg.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), fkd.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fkg.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fkd.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fkg.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), fkd.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fkg.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), fkd.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fkg.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), fkd.a(0.0F, 20.0F, 0.0F));
      return fkh.a($$0, 32, 32);
   }

   @Override
   public fkb a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aX()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * ati.a(0.6F * $$3);
   }
}
