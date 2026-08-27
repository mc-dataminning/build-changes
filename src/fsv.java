public class fsv extends fup<buz, fev<buz>> {
   private static final aey a = new aey("textures/entity/fish/cod.png");

   public fsv(ftj.a $$0) {
      super($$0, new fev<>($$0.a(fid.u)), 0.3F);
   }

   public aey a(buz $$0) {
      return a;
   }

   protected void a(buz $$0, elr $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * ary.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
