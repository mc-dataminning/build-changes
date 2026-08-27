public class aca implements xf<za> {
   private final hx a;
   private final float b;

   public aca(hx $$0, float $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aca(ui $$0) {
      this.a = $$0.e();
      this.b = $$0.readFloat();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public hx a() {
      return this.a;
   }

   public float d() {
      return this.b;
   }
}
