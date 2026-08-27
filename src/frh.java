public class frh {
   public static final frh a = new frh(0.0F);
   final float b;
   final float c;
   final float d;

   public frh(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public frh(float $$0) {
      this($$0, $$0, $$0);
   }

   public frh a(float $$0) {
      return new frh(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public frh a(float $$0, float $$1, float $$2) {
      return new frh(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
