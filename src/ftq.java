public class ftq extends ftu<bwm, ffh<bwm>> {
   private static final aer a = new aer("textures/entity/llama/creamy.png");
   private static final aer i = new aer("textures/entity/llama/white.png");
   private static final aer j = new aer("textures/entity/llama/brown.png");
   private static final aer k = new aer("textures/entity/llama/gray.png");

   public ftq(fso.a $$0, fhl $$1) {
      super($$0, new ffh<>($$0.a($$1)), 0.7F);
      this.a(new fwq(this, $$0.f()));
   }

   public aer a(bwm $$0) {
      return switch ($$0.gl()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
