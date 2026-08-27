public class aaw implements xf<za> {
   private final hx a;
   private final boolean b;

   public aaw(hx $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aaw(ui $$0) {
      this.a = $$0.e();
      this.b = $$0.readBoolean();
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

   public boolean d() {
      return this.b;
   }
}
