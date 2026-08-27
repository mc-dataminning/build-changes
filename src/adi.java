public class adi implements wo<acp> {
   private final int a;
   private final int b;

   public adi(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public adi(ty $$0) {
      this.a = $$0.n();
      this.b = $$0.n();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
