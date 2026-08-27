public class fqk extends fqe<bsb, fcf> {
   private static final acq a = new acq("textures/entity/parrot/parrot_red_blue.png");
   private static final acq i = new acq("textures/entity/parrot/parrot_blue.png");
   private static final acq j = new acq("textures/entity/parrot/parrot_green.png");
   private static final acq k = new acq("textures/entity/parrot/parrot_yellow_blue.png");
   private static final acq l = new acq("textures/entity/parrot/parrot_grey.png");

   public fqk(foy.a $$0) {
      super($$0, new fcf($$0.a(fed.aA)), 0.3F);
   }

   public acq a(bsb $$0) {
      return a($$0.gg());
   }

   public static acq a(bsb.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bsb $$0, float $$1) {
      float $$2 = apa.i($$1, $$0.bZ, $$0.bW);
      float $$3 = apa.i($$1, $$0.bY, $$0.bX);
      return (apa.a($$2) + 1.0F) * $$3;
   }
}
