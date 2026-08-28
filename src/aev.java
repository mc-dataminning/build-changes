public record aev(agq e, byte f) implements zv<ach> {
   public static final zm<wz, aev> a = zv.a(aev::a, aev::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aev(wz $$0) {
      this(new agq($$0), $$0.readByte());
   }

   private void a(wz $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zx<aev> a() {
      return agt.al;
   }

   public void a(ach $$0) {
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
