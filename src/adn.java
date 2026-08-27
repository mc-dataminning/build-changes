public class adn implements xf<adj> {
   private final int a;
   private final hx b;

   public adn(int $$0, hx $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public adn(ui $$0) {
      this.a = $$0.n();
      this.b = $$0.e();
   }

   @Override
   public void a(ui $$0) {
      $$0.c(this.a);
      $$0.a(this.b);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public hx d() {
      return this.b;
   }
}
