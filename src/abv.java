public class abv implements vd<abd> {
   private final int a;
   private final int b;

   public abv(int $$0, int $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public abv(so $$0) {
      this.a = $$0.m();
      this.b = $$0.m();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public int d() {
      return this.b;
   }
}
