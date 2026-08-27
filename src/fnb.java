public class fnb {
   public static final fnb a = new fnb(0.0F);
   final float b;
   final float c;
   final float d;

   public fnb(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fnb(float $$0) {
      this($$0, $$0, $$0);
   }

   public fnb a(float $$0) {
      return new fnb(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fnb a(float $$0, float $$1, float $$2) {
      return new fnb(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
