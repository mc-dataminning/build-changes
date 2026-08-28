public record aez(agw e, byte f) implements zr<acg> {
   public static final zi<wv, aez> a = zr.a(aez::a, aez::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aez(wv $$0) {
      this(new agw($$0), $$0.readByte());
   }

   private void a(wv $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zt<aez> a() {
      return agz.ap;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agw b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
