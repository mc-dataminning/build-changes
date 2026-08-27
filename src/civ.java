public class civ extends cja {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public civ(int $$0, String $$1, cja.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public aew h() {
      return new aew(this.c);
   }

   public int i() {
      return this.b;
   }
}
