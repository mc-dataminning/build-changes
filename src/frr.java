public class frr extends ftu<buf, fdt> {
   private static final aer a = new aer("textures/entity/bat.png");

   public frr(fso.a $$0) {
      super($$0, new fdt($$0.a(fhm.g)), 0.25F);
   }

   public aer a(buf $$0) {
      return a;
   }

   protected void a(buf $$0, elg $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(buf $$0, elg $$1, float $$2, float $$3, float $$4) {
      if ($$0.q()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, arp.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
