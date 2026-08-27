public class fmz {
   public static final fmz a = new fmz(0.0F);
   final float b;
   final float c;
   final float d;

   public fmz(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fmz(float $$0) {
      this($$0, $$0, $$0);
   }

   public fmz a(float $$0) {
      return new fmz(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fmz a(float $$0, float $$1, float $$2) {
      return new fmz(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
