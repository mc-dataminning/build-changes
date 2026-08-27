public class fnt {
   private final float a;
   private final float b;

   public fnt(float $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   @Override
   public String toString() {
      return "(" + this.a + "," + this.b + ")";
   }
}
