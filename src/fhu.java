public class fhu {
   public static final fhu a = a(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
   public final float b;
   public final float c;
   public final float d;
   public final float e;
   public final float f;
   public final float g;

   private fhu(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   public static fhu a(float $$0, float $$1, float $$2) {
      return a($$0, $$1, $$2, 0.0F, 0.0F, 0.0F);
   }

   public static fhu b(float $$0, float $$1, float $$2) {
      return a(0.0F, 0.0F, 0.0F, $$0, $$1, $$2);
   }

   public static fhu a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      return new fhu($$0, $$1, $$2, $$3, $$4, $$5);
   }
}
