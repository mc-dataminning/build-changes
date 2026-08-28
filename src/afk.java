public record afk(ahh e, byte f) implements aac<acr> {
   public static final zt<xg, afk> a = aac.a(afk::a, afk::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private afk(xg $$0) {
      this(new ahh($$0), $$0.readByte());
   }

   private void a(xg $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public aae<afk> a() {
      return ahk.ap;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public ahh b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
