public class acb implements ve<abd> {
   private final boolean a;
   private final boolean b;

   public acb(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acb(sp $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sp $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
