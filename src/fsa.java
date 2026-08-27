public class fsa extends fud<bue, fdy> {
   private static final aer a = new aer("textures/entity/bat.png");

   public fsa(fsx.a $$0) {
      super($$0, new fdy($$0.a(fhr.g)), 0.25F);
   }

   public aer a(bue $$0) {
      return a;
   }

   protected void a(bue $$0, elf $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(bue $$0, elf $$1, float $$2, float $$3, float $$4) {
      if ($$0.q()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, arp.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
