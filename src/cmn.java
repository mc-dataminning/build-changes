public class cmn extends cms {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cmn(int $$0, String $$1, cms.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public ahg h() {
      return new ahg(this.c);
   }

   public int i() {
      return this.b;
   }
}
