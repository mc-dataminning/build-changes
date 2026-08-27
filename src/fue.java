public class fue extends fui<bwo, ffr<bwo>> {
   private static final aeu a = new aeu("textures/entity/llama/creamy.png");
   private static final aeu i = new aeu("textures/entity/llama/white.png");
   private static final aeu j = new aeu("textures/entity/llama/brown.png");
   private static final aeu k = new aeu("textures/entity/llama/gray.png");

   public fue(ftc.a $$0, fhv $$1) {
      super($$0, new ffr<>($$0.a($$1)), 0.7F);
      this.a(new fxe(this, $$0.f()));
   }

   public aeu a(bwo $$0) {
      return switch ($$0.gm()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
