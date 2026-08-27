public class fmt {
   public static final fmt a = new fmt(0.0F);
   final float b;
   final float c;
   final float d;

   public fmt(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fmt(float $$0) {
      this($$0, $$0, $$0);
   }

   public fmt a(float $$0) {
      return new fmt(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fmt a(float $$0, float $$1, float $$2) {
      return new fmt(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
