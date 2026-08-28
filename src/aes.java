public record aes(agn e, byte f) implements zs<ace> {
   public static final zj<ww, aes> a = zs.a(aes::a, aes::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aes(ww $$0) {
      this(new agn($$0), $$0.readByte());
   }

   private void a(ww $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zu<aes> a() {
      return agq.al;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agn b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
