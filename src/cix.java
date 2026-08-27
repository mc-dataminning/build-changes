public class cix extends cjc {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cix(int $$0, String $$1, cjc.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public aey h() {
      return new aey(this.c);
   }

   public int i() {
      return this.b;
   }
}
