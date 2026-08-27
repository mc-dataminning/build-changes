public record aay(act d, byte e) implements wu<yo> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public aay(ue $$0) {
      this(new act($$0), $$0.readByte());
   }

   @Override
   public void a(ue $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public act a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
