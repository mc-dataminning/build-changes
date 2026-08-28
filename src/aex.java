public record aex(agv e, byte f) implements zo<acf> {
   public static final ze<wp, aex> a = zo.a(aex::a, aex::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aex(wp $$0) {
      this(new agv($$0), $$0.readByte());
   }

   private void a(wp $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zq<aex> a() {
      return agy.ap;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agv b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
