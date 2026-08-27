public record aar(acm d, byte e) implements wo<yh> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public aar(ty $$0) {
      this(new acm($$0), $$0.readByte());
   }

   @Override
   public void a(ty $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public acm a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
