public class abl implements ux<aaw> {
   private final int a;
   private final int b;

   public abl(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public abl(si $$0) {
      this.a = $$0.readByte();
      this.b = $$0.readByte();
   }

   @Override
   public void a(si $$0) {
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
