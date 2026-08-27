public class fpn {
   public static final fpn a = new fpn(0.0F);
   final float b;
   final float c;
   final float d;

   public fpn(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public fpn(float $$0) {
      this($$0, $$0, $$0);
   }

   public fpn a(float $$0) {
      return new fpn(this.b + $$0, this.c + $$0, this.d + $$0);
   }

   public fpn a(float $$0, float $$1, float $$2) {
      return new fpn(this.b + $$0, this.c + $$1, this.d + $$2);
   }
}
