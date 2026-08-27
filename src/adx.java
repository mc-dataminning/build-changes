public record adx(afs e, byte f) implements yz<abk> {
   public static final yq<wd, adx> a = yz.a(adx::a, adx::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private adx(wd $$0) {
      this(new afs($$0), $$0.readByte());
   }

   private void a(wd $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zb<adx> a() {
      return afv.al;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public afs b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
