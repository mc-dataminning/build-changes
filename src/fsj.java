public class fsj extends fud<bup, fej<bup>> {
   private static final aer a = new aer("textures/entity/fish/cod.png");

   public fsj(fsx.a $$0) {
      super($$0, new fej<>($$0.a(fhr.u)), 0.3F);
   }

   public aer a(bup $$0) {
      return a;
   }

   protected void a(bup $$0, elf $$1, float $$2, float $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      float $$5 = 4.3F * arp.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$5));
      if (!$$0.aX()) {
         $$1.a(0.1F, 0.1F, -0.1F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
