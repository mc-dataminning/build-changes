public class frl extends fny<byw> {
   public static final acq a = new acq("textures/entity/projectiles/arrow.png");
   public static final acq f = new acq("textures/entity/projectiles/tipped_arrow.png");

   public frl(foy.a $$0) {
      super($$0);
   }

   public acq a(byw $$0) {
      return $$0.z() > 0 ? f : a;
   }
}
