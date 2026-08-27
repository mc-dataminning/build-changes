public class fsg extends fuj<bus, fed> {
   private static final aez a = new aez("textures/entity/bat.png");

   public fsg(ftd.a $$0) {
      super($$0, new fed($$0.a(fhw.g)), 0.25F);
   }

   public aez a(bus $$0) {
      return a;
   }

   protected void a(bus $$0, elj $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(bus $$0, elj $$1, float $$2, float $$3, float $$4) {
      if ($$0.t()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, asb.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
