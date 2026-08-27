public class foj extends fqe<brr, fav<brr>> {
   private static final acq a = new acq("textures/entity/fish/cod.png");

   public foj(foy.a $$0) {
      super($$0, new fav<>($$0.a(fed.u)), 0.3F);
   }

   public acq a(brr $$0) {
      return a;
   }

   protected void a(brr $$0, eij $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * apa.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aV()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
