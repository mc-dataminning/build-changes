public class fql<T extends bqa> extends fre<T> {
   private final ftv a;
   private final ftv b;

   public fql(ftv $$0) {
      this.a = $$0;
      this.b = $$0.b("tail_fin");
   }

   public static fub b() {
      fud $$0 = new fud();
      fue $$1 = $$0.a();
      int $$2 = 22;
      $$1.a("body", fua.c().a(0, 0).a(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F), ftx.a(0.0F, 22.0F, 0.0F));
      $$1.a("head", fua.c().a(11, 0).a(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F), ftx.a(0.0F, 22.0F, 0.0F));
      $$1.a("nose", fua.c().a(0, 0).a(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F), ftx.a(0.0F, 22.0F, -3.0F));
      $$1.a("right_fin", fua.c().a(22, 1).a(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), ftx.a(-1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 4)));
      $$1.a("left_fin", fua.c().a(22, 4).a(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F), ftx.a(1.0F, 23.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 4)));
      $$1.a("tail_fin", fua.c().a(22, 3).a(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F), ftx.a(0.0F, 22.0F, 7.0F));
      $$1.a("top_fin", fua.c().a(20, -6).a(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F), ftx.a(0.0F, 20.0F, 0.0F));
      return fub.a($$0, 32, 32);
   }

   @Override
   public ftv a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.bc()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * axm.a(0.6F * $$3);
   }
}
