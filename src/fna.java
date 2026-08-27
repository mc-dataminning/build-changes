public class fna {
   public static final fna a = new fna(0.0F);
   final float b;
   final float c;
   final float d;

   public fna(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fna(float $$0) {
      this($$0, $$0, $$0);
   }

   public fna a(float $$0) {
      return new fna(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fna a(float $$0, float $$1, float $$2) {
      return new fna(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
