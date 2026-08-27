public record aee(afz e, byte f) implements ze<abq> {
   public static final yv<wi, aee> a = ze.a(aee::a, aee::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aee(wi $$0) {
      this(new afz($$0), $$0.readByte());
   }

   private void a(wi $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zg<aee> a() {
      return agc.al;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afz b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
