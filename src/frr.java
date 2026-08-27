public class frr extends fqe<bwq, fdo> {
   private static final acq a = new acq("textures/entity/illager/vex.png");
   private static final acq i = new acq("textures/entity/illager/vex_charging.png");

   public frr(foy.a $$0) {
      super($$0, new fdo($$0.a(fed.bI)), 0.3F);
      this.a(new fsz<>(this, $$0.d()));
   }

   protected int a(bwq $$0, gu $$1) {
      return 15;
   }

   public acq a(bwq $$0) {
      return $$0.fY() ? i : a;
   }
}
