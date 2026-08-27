public class cle extends clj {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cle(int $$0, String $$1, clj.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public agm h() {
      return new agm(this.c);
   }

   public int i() {
      return this.b;
   }
}
