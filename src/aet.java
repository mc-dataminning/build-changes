public record aet(agq e, byte f) implements zp<ace> {
   public static final zg<wt, aet> a = zp.a(aet::a, aet::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aet(wt $$0) {
      this(new agq($$0), $$0.readByte());
   }

   private void a(wt $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zr<aet> a() {
      return agt.am;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agq b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
