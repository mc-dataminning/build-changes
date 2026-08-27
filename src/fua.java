public class fua extends ftu<bva, ffo> {
   private static final aer a = new aer("textures/entity/parrot/parrot_red_blue.png");
   private static final aer i = new aer("textures/entity/parrot/parrot_blue.png");
   private static final aer j = new aer("textures/entity/parrot/parrot_green.png");
   private static final aer k = new aer("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aer l = new aer("textures/entity/parrot/parrot_grey.png");

   public fua(fso.a $$0) {
      super($$0, new ffo($$0.a(fhm.aA)), 0.3F);
   }

   public aer a(bva $$0) {
      return a($$0.gh());
   }

   public static aer a(bva.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bva $$0, float $$1) {
      float $$2 = arp.i($$1, $$0.bZ, $$0.bW);
      float $$3 = arp.i($$1, $$0.bY, $$0.bX);
      return (arp.a($$2) + 1.0F) * $$3;
   }
}
