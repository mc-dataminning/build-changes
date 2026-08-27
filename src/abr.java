public class abr implements ve<abd> {
   private final int a;
   private final int b;

   public abr(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public abr(so $$0) {
      this.a = $$0.readByte();
      this.b = $$0.readByte();
   }

   @Override
   public void a(so $$0) {
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
