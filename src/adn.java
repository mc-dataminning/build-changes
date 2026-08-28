public record adn(int b, float c) implements zs<ace> {
   public static final zj<wl, adn> a = zs.a(adn::a, adn::new);

   public adn(btk $$0) {
      this($$0.al(), $$0.eJ());
   }

   private adn(wl $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zu<adn> a() {
      return agq.I;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
