public record aek(agi e, byte f) implements zd<abs> {
   public static final yu<wh, aek> a = zd.a(aek::a, aek::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aek(wh $$0) {
      this(new agi($$0), $$0.readByte());
   }

   private void a(wh $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zf<aek> a() {
      return agl.ap;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agi b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
