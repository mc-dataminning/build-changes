public class ftl extends ftp<bwk, ffd<bwk>> {
   private static final aep a = new aep("textures/entity/llama/creamy.png");
   private static final aep i = new aep("textures/entity/llama/white.png");
   private static final aep j = new aep("textures/entity/llama/brown.png");
   private static final aep k = new aep("textures/entity/llama/gray.png");

   public ftl(fsj.a $$0, fhh $$1) {
      super($$0, new ffd<>($$0.a($$1)), 0.7F);
      this.a(new fwl(this, $$0.f()));
   }

   public aep a(bwk $$0) {
      return switch ($$0.gl()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
