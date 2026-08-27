public record abi(add d, byte e) implements xd<yx> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public abi(ug $$0) {
      this(new add($$0), $$0.readByte());
   }

   @Override
   public void a(ug $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public add a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
