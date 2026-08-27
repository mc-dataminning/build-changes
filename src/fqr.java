public class fqr extends fqe<bsf, fcq<bsf>> {
   private static final acq a = new acq("textures/entity/rabbit/brown.png");
   private static final acq i = new acq("textures/entity/rabbit/white.png");
   private static final acq j = new acq("textures/entity/rabbit/black.png");
   private static final acq k = new acq("textures/entity/rabbit/gold.png");
   private static final acq l = new acq("textures/entity/rabbit/salt.png");
   private static final acq m = new acq("textures/entity/rabbit/white_splotched.png");
   private static final acq n = new acq("textures/entity/rabbit/toast.png");
   private static final acq o = new acq("textures/entity/rabbit/caerbannog.png");

   public fqr(foy.a $$0) {
      super($$0, new fcq<>($$0.a(fed.aY)), 0.3F);
   }

   public acq a(bsf $$0) {
      String $$1 = n.a($$0.Z().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.fY()) {
            case a -> a;
            case b -> i;
            case c -> j;
            case e -> k;
            case f -> l;
            case d -> m;
            case g -> o;
         };
      }
   }
}
