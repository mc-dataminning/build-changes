public record aae(abx d, byte e) implements wb<xu> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public aae(tl $$0) {
      this(new abx($$0), $$0.readByte());
   }

   @Override
   public void a(tl $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public abx a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
