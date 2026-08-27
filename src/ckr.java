public class ckr extends ckw {
   private static final String a = "textures/entity/horse/";
   private final int b;
   private final String c;

   public ckr(int $$0, String $$1, ckw.a $$2) {
      super($$2);
      this.b = $$0;
      this.c = "textures/entity/horse/armor/horse_armor_" + $$1 + ".png";
   }

   public agg h() {
      return new agg(this.c);
   }

   public int i() {
      return this.b;
   }
}
