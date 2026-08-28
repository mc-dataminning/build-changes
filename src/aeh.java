public record aeh(agc e, byte f) implements zf<abt> {
   public static final yw<wj, aeh> a = zf.a(aeh::a, aeh::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aeh(wj $$0) {
      this(new agc($$0), $$0.readByte());
   }

   private void a(wj $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zh<aeh> a() {
      return agf.al;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agc b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
