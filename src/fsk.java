public class fsk extends fun<bum, fei> {
   private static final aex a = new aex("textures/entity/bat.png");

   public fsk(fth.a $$0) {
      super($$0, new fei($$0.a(fib.g)), 0.25F);
   }

   public aex a(bum $$0) {
      return a;
   }

   protected void a(bum $$0, elp $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(bum $$0, elp $$1, float $$2, float $$3, float $$4) {
      if ($$0.t()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, arx.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
