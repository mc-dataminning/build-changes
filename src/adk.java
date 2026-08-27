public class adk implements wu<acw> {
   private final int a;
   private final int b;

   public adk(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public adk(ue $$0) {
      this.a = $$0.readByte();
      this.b = $$0.readByte();
   }

   @Override
   public void a(ue $$0) {
      $$0.k(this.a);
      $$0.k(this.b);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
