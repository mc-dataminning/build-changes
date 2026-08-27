public class acc implements vf<abe> {
   private final boolean a;
   private final boolean b;

   public acc(boolean $$0, boolean $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public acc(sq $$0) {
      this.a = $$0.readBoolean();
      this.b = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   public boolean a() {
      return this.a;
   }

   public boolean d() {
      return this.b;
   }
}
