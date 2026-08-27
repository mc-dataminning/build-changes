public class fja {
   public static final fja a = new fja(0.0F);
   final float b;
   final float c;
   final float d;

   public fja(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fja(float $$0) {
      this($$0, $$0, $$0);
   }

   public fja a(float $$0) {
      return new fja(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fja a(float $$0, float $$1, float $$2) {
      return new fja(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
