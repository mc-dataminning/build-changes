public record aan(aci d, byte e) implements wk<yd> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public aan(tu $$0) {
      this(new aci($$0), $$0.readByte());
   }

   @Override
   public void a(tu $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public aci a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
