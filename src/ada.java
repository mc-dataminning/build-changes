public record ada(int a, adl b) implements ux<acz> {
   private static final int c = 1048576;

   public ada(si $$0) {
      this($$0.m(), a($$0.s(), $$0));
   }

   private static adl a(aer $$0, si $$1) {
      return b($$0, $$1);
   }

   private static adn b(aer $$0, si $$1) {
      int $$2 = $$1.readableBytes();
      if ($$2 >= 0 && $$2 <= 1048576) {
         $$1.j($$2);
         return new adn($$0);
      } else {
         throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
      }
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
   }

   public void a(acz $$0) {
      $$0.a(this);
   }

   public adl d() {
      return this.b;
   }
}
