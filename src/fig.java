public class fig {
   public static final fig a = new fig(0.0F);
   final float b;
   final float c;
   final float d;

   public fig(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fig(float $$0) {
      this($$0, $$0, $$0);
   }

   public fig a(float $$0) {
      return new fig(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fig a(float $$0, float $$1, float $$2) {
      return new fig(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
