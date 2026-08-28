public record aed(aga e, byte f) implements yw<abl> {
   public static final yn<wa, aed> a = yw.a(aed::a, aed::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aed(wa $$0) {
      this(new aga($$0), $$0.readByte());
   }

   private void a(wa $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public yy<aed> a() {
      return agd.ao;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public aga b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
