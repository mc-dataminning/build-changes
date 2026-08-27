public class frp extends fqe<bsm, fdn<bsm>> {
   private static final acq a = new acq("textures/entity/turtle/big_sea_turtle.png");

   public frp(foy.a $$0) {
      super($$0, new fdn<>($$0.a(fed.bH)), 0.7F);
   }

   public void a(bsm $$0, float $$1, float $$2, eij $$3, fjx $$4, int $$5) {
      if ($$0.h_()) {
         this.d *= 0.5F;
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public acq a(bsm $$0) {
      return a;
   }
}
