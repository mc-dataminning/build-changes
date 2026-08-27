public class ckz extends cle {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public ckz(int $$0, String $$1, cle.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public agi h() {
      return new agi(this.c);
   }

   public int i() {
      return this.b;
   }
}
