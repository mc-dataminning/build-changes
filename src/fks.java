public class fks {
   public static final fks a = new fks(0.0F);
   final float b;
   final float c;
   final float d;

   public fks(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fks(float $$0) {
      this($$0, $$0, $$0);
   }

   public fks a(float $$0) {
      return new fks(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fks a(float $$0, float $$1, float $$2) {
      return new fks(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
