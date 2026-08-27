public class ftq {
   public static final ftq a = new ftq(0.0F);
   final float b;
   final float c;
   final float d;

   public ftq(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public ftq(float $$0) {
      this($$0, $$0, $$0);
   }

   public ftq a(float $$0) {
      return new ftq(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public ftq a(float $$0, float $$1, float $$2) {
      return new ftq(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
