public record aeu(agr e, byte f) implements zq<acf> {
   public static final zh<wu, aeu> a = zq.a(aeu::a, aeu::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aeu(wu $$0) {
      this(new agr($$0), $$0.readByte());
   }

   private void a(wu $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zs<aeu> a() {
      return agu.am;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agr b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
