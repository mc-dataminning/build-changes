public class fuf extends fuj<bwz, ffr<bwz>> {
   private static final aez a = new aez("textures/entity/llama/creamy.png");
   private static final aez i = new aez("textures/entity/llama/white.png");
   private static final aez j = new aez("textures/entity/llama/brown.png");
   private static final aez k = new aez("textures/entity/llama/gray.png");

   public fuf(ftd.a $$0, fhv $$1) {
      super($$0, new ffr<>($$0.a($$1)), 0.7F);
      this.a(new fxf(this, $$0.f()));
   }

   public aez a(bwz $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
