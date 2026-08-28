public record aee(agb e, byte f) implements yw<abl> {
   public static final yn<wa, aee> a = yw.a(aee::a, aee::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aee(wa $$0) {
      this(new agb($$0), $$0.readByte());
   }

   private void a(wa $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public yy<aee> a() {
      return age.ap;
   }

   public void a(abl $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agb b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
