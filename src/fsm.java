public class fsm extends fup<buo, fek> {
   private static final aey a = new aey("textures/entity/bat.png");

   public fsm(ftj.a $$0) {
      super($$0, new fek($$0.a(fid.g)), 0.25F);
   }

   public aey a(buo $$0) {
      return a;
   }

   protected void a(buo $$0, elr $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(buo $$0, elr $$1, float $$2, float $$3, float $$4) {
      if ($$0.t()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, ary.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
