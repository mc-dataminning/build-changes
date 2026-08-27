public class aej implements xg<adk> {
   private final boolean a;
   private final boolean b;

   public aej(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aej(uj $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adk $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
