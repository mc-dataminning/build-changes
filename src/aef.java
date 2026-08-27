public class aef implements xf<adj> {
   private final boolean a;

   public aef(boolean $$0) {
      this.a = $$0;
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public aef(ui $$0) {
      this.a = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
   }

   public boolean a() {
      return this.a;
   }
}
