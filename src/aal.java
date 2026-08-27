public class aal implements ux<wp> {
   private final tf a;
   private final tf b;

   public aal(tf $$0, tf $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aal(si $$0) {
      this.a = $$0.l();
      this.b = $$0.l();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(wp $$0) {
      $$0.a(this);
   }

   public tf a() {
      return this.a;
   }

   public tf d() {
      return this.b;
   }
}
