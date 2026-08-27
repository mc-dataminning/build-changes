public record adn(int a, int b, boolean c) implements wu<acw> {
   public adn(ue $$0) {
      this($$0.n(), $$0.n(), $$0.readBoolean());
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      $$0.a(this.c);
   }

   public void a(acw $$0) {
      $$0.a(this);
   }

   public int d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
