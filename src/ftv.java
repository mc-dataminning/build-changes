public class ftv extends ftp<buy, ffk> {
   private static final aep a = new aep("textures/entity/parrot/parrot_red_blue.png");
   private static final aep i = new aep("textures/entity/parrot/parrot_blue.png");
   private static final aep j = new aep("textures/entity/parrot/parrot_green.png");
   private static final aep k = new aep("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aep l = new aep("textures/entity/parrot/parrot_grey.png");

   public ftv(fsj.a $$0) {
      super($$0, new ffk($$0.a(fhi.aA)), 0.3F);
   }

   public aep a(buy $$0) {
      return a($$0.gh());
   }

   public static aep a(buy.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(buy $$0, float $$1) {
      float $$2 = aro.i($$1, $$0.bZ, $$0.bW);
      float $$3 = aro.i($$1, $$0.bY, $$0.bX);
      return (aro.a($$2) + 1.0F) * $$3;
   }
}
