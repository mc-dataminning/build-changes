public class fuh extends ftu<bve, ffz<bve>> {
   private static final aer a = new aer("textures/entity/rabbit/brown.png");
   private static final aer i = new aer("textures/entity/rabbit/white.png");
   private static final aer j = new aer("textures/entity/rabbit/black.png");
   private static final aer k = new aer("textures/entity/rabbit/gold.png");
   private static final aer l = new aer("textures/entity/rabbit/salt.png");
   private static final aer m = new aer("textures/entity/rabbit/white_splotched.png");
   private static final aer n = new aer("textures/entity/rabbit/toast.png");
   private static final aer o = new aer("textures/entity/rabbit/caerbannog.png");

   public fuh(fso.a $$0) {
      super($$0, new ffz<>($$0.a(fhm.aY)), 0.3F);
   }

   public aer a(bve $$0) {
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
