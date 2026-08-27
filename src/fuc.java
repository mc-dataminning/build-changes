public class fuc extends ftp<bvc, ffv<bvc>> {
   private static final aep a = new aep("textures/entity/rabbit/brown.png");
   private static final aep i = new aep("textures/entity/rabbit/white.png");
   private static final aep j = new aep("textures/entity/rabbit/black.png");
   private static final aep k = new aep("textures/entity/rabbit/gold.png");
   private static final aep l = new aep("textures/entity/rabbit/salt.png");
   private static final aep m = new aep("textures/entity/rabbit/white_splotched.png");
   private static final aep n = new aep("textures/entity/rabbit/toast.png");
   private static final aep o = new aep("textures/entity/rabbit/caerbannog.png");

   public fuc(fsj.a $$0) {
      super($$0, new ffv<>($$0.a(fhi.aY)), 0.3F);
   }

   public aep a(bvc $$0) {
      String $$1 = n.a($$0.ab().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.fZ()) {
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
