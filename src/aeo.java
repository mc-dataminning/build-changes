public record aeo(agl e, byte f) implements zk<abz> {
   public static final zb<wo, aeo> a = zk.a(aeo::a, aeo::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aeo(wo $$0) {
      this(new agl($$0), $$0.readByte());
   }

   private void a(wo $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zm<aeo> a() {
      return ago.am;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agl b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
