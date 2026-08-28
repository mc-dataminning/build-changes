public record aes(agp e, byte f) implements zo<acd> {
   public static final zf<ws, aes> a = zo.a(aes::a, aes::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aes(ws $$0) {
      this(new agp($$0), $$0.readByte());
   }

   private void a(ws $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zq<aes> a() {
      return ags.am;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agp b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
