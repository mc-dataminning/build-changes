public class acy implements wb<aca> {
   private final boolean a;
   private final boolean b;

   public acy(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acy(tl $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
