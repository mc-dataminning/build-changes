public class fid<T extends bjt> extends ffp<T> {
   private final fiw a;
   private final fiw b;

   public fid(fiw $$0) {
      this.a = $$0;
      this.b = $$0.b("tail");
   }

   public static fjc a(fja $$0) {
      fje $$1 = new fje();
      fjf $$2 = $$1.a();
      int $$3 = 22;
      $$2.a("body", fjb.c().a(0, 0).a(-1.0F, -1.5F, -3.0F, 2.0F, 3.0F, 6.0F, $$0), fiy.a(0.0F, 22.0F, 0.0F));
      $$2.a("tail", fjb.c().a(22, -6).a(0.0F, -1.5F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fiy.a(0.0F, 22.0F, 3.0F));
      $$2.a("right_fin", fjb.c().a(2, 16).a(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fiy.a(-1.0F, 22.5F, 0.0F, 0.0F, (float) (Math.PI / 4), 0.0F));
      $$2.a("left_fin", fjb.c().a(2, 12).a(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, $$0), fiy.a(1.0F, 22.5F, 0.0F, 0.0F, (float) (-Math.PI / 4), 0.0F));
      $$2.a("top_fin", fjb.c().a(10, -5).a(0.0F, -3.0F, 0.0F, 0.0F, 3.0F, 6.0F, $$0), fiy.a(0.0F, 20.5F, -3.0F));
      return fjc.a($$1, 32, 32);
   }

   @Override
   public fiw a() {
      return this.a;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 1.0F;
      if (!$$0.aX()) {
         $$6 = 1.5F;
      }

      this.b.f = -$$6 * 0.45F * asy.a(0.6F * $$3);
   }
}
