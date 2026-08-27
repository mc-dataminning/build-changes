public class aak implements wu<yo> {
   private final hv a;
   private final boolean b;

   public aak(hv $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aak(ue $$0) {
      this.a = $$0.e();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public hv a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
