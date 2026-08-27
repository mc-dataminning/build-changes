public record acz(aeu e, byte f) implements yb<aam> {
   public static final xs<vf, acz> a = yb.a(acz::a, acz::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private acz(vf $$0) {
      this(new aeu($$0), $$0.readByte());
   }

   private void a(vf $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public yd<acz> a() {
      return aex.al;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public aeu b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
