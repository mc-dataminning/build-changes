public class cjz extends cke {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cjz(int $$0, String $$1, cke.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public afw h() {
      return new afw(this.c);
   }

   public int i() {
      return this.b;
   }
}
