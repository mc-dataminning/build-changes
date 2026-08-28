public record aeo(agm e, byte f) implements zh<abw> {
   public static final yy<wl, aeo> a = zh.a(aeo::a, aeo::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aeo(wl $$0) {
      this(new agm($$0), $$0.readByte());
   }

   private void a(wl $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zj<aeo> a() {
      return agp.ap;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agm b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
