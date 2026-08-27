public class cin extends cis {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public cin(int $$0, String $$1, cis.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public aer h() {
      return new aer(this.c);
   }

   public int i() {
      return this.b;
   }
}
