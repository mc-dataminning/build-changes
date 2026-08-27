public class fgs<T extends bjt> extends fgg<T> {
   private final fiw a;

   public fgs(fiw $$0) {
      this.a = $$0;
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      int $$2 = 20;
      int $$3 = 8;
      int $$4 = 16;
      int $$5 = 4;
      $$1.a("bottom", fjb.c().a(0, 10).a(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F), fiy.a(0.0F, 4.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$1.a("front", fjb.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fiy.a(-9.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$1.a("back", fjb.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fiy.a(9.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$1.a("left", fjb.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fiy.a(0.0F, 4.0F, -7.0F, 0.0F, (float) Math.PI, 0.0F));
      $$1.a("right", fjb.c().a(0, 0).a(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), fiy.a(0.0F, 4.0F, 7.0F));
      return fjc.a($$0, 64, 32);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
   }

   @Override
   public fiw a() {
      return this.a;
   }
}
