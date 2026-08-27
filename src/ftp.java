public class ftp extends fvj<bwa, ffn<bwa>> {
   private static final afw a = new afw("textures/entity/fish/cod.png");

   public ftp(fud.a $$0) {
      super($$0, new ffn<>($$0.a(fiv.u)), 0.3F);
   }

   public afw a(bwa $$0) {
      return a;
   }

   protected void a(bwa $$0, emh $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * asy.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
