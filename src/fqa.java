public class fqa extends fqe<btn, fby<btn>> {
   private static final acq a = new acq("textures/entity/llama/creamy.png");
   private static final acq i = new acq("textures/entity/llama/white.png");
   private static final acq j = new acq("textures/entity/llama/brown.png");
   private static final acq k = new acq("textures/entity/llama/gray.png");

   public fqa(foy.a $$0, fec $$1) {
      super($$0, new fby<>($$0.a($$1)), 0.7F);
      this.a(new fta(this, $$0.f()));
   }

   public acq a(btn $$0) {
      return switch ($$0.gk()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
