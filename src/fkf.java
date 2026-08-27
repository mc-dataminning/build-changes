public class fkf {
   public static final fkf a = new fkf(0.0F);
   final float b;
   final float c;
   final float d;

   public fkf(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fkf(float $$0) {
      this($$0, $$0, $$0);
   }

   public fkf a(float $$0) {
      return new fkf(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fkf a(float $$0, float $$1, float $$2) {
      return new fkf(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
