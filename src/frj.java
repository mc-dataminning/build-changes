public class frj {
   public static final frj a = new frj(0.0F);
   final float b;
   final float c;
   final float d;

   public frj(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public frj(float $$0) {
      this($$0, $$0, $$0);
   }

   public frj a(float $$0) {
      return new frj(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public frj a(float $$0, float $$1, float $$2) {
      return new frj(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
