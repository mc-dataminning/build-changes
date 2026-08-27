public record abm(adh d, byte e) implements xg<zb> {
   public static final byte a = 1;
   public static final byte b = 2;
   public static final byte c = 3;

   public abm(uj $$0) {
      this(new adh($$0), $$0.readByte());
   }

   @Override
   public void a(uj $$0) {
      this.d.a($$0);
      $$0.k(this.e);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.e & $$0) != 0;
   }

   public adh a() {
      return this.d;
   }

   public byte d() {
      return this.e;
   }
}
