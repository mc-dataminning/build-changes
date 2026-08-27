public record aed(afy e, byte f) implements ze<abq> {
   public static final yv<wi, aed> a = ze.a(aed::a, aed::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aed(wi $$0) {
      this(new afy($$0), $$0.readByte());
   }

   private void a(wi $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zg<aed> a() {
      return agb.al;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afy b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
