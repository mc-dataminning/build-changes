public class cfp extends cfu {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cfp(int $$0, String $$1, cfu.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public acq h() {
      return new acq(this.c);
   }

   public int i() {
      return this.b;
   }
}
