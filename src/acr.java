public class acr implements ux<aaw> {
   private final egz a;
   private final bgp b;
   private final int c;

   public acr(bgp $$0, egz $$1, int $$2) {
      this.b = $$0;
      this.a = $$1;
      this.c = $$2;
   }

   public acr(si $$0) {
      this.b = $$0.b(bgp.class);
      this.a = $$0.x();
      this.c = $$0.m();
   }

   @Override
   public void a(si $$0) {
      $$0.a(this.b);
      $$0.a(this.a);
      $$0.c(this.c);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   public bgp a() {
      return this.b;
   }

   public egz d() {
      return this.a;
   }

   public int e() {
      return this.c;
   }
}
