public record aew(agr e, byte f) implements zw<aci> {
   public static final zn<xa, aew> a = zw.a(aew::a, aew::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aew(xa $$0) {
      this(new agr($$0), $$0.readByte());
   }

   private void a(xa $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zy<aew> a() {
      return agu.al;
   }

   public void a(aci $$0) {
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
