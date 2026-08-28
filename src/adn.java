public record adn(int b, float c) implements zp<ace> {
   public static final zg<wf, adn> a = zp.a(adn::a, adn::new);

   public adn(bva $$0) {
      this($$0.as(), $$0.eN());
   }

   private adn(wf $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<adn> a() {
      return agt.I;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
