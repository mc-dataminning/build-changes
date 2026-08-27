public class ftz extends fud<bwl, ffm<bwl>> {
   private static final aer a = new aer("textures/entity/llama/creamy.png");
   private static final aer i = new aer("textures/entity/llama/white.png");
   private static final aer j = new aer("textures/entity/llama/brown.png");
   private static final aer k = new aer("textures/entity/llama/gray.png");

   public ftz(fsx.a $$0, fhq $$1) {
      super($$0, new ffm<>($$0.a($$1)), 0.7F);
      this.a(new fwz(this, $$0.f()));
   }

   public aer a(bwl $$0) {
      return switch ($$0.gm()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
