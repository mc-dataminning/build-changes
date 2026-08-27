public record abl(adg d, byte e) implements xf<za> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public abl(ui $$0) {
      this(new adg($$0), $$0.readByte());
   }

   @Override
   public void a(ui $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public adg a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
