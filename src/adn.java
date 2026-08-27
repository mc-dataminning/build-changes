public record adn(afi e, byte f) implements yp<aba> {
   public static final yg<vt, adn> a = yp.a(adn::a, adn::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private adn(vt $$0) {
      this(new afi($$0), $$0.readByte());
   }

   private void a(vt $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public yr<adn> a() {
      return afl.al;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afi b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
