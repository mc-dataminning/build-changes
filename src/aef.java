public class aef implements xd<adg> {
   private final boolean a;
   private final boolean b;

   public aef(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public aef(ug $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
