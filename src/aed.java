public record aed(aga e, byte f) implements yv<abk> {
   public static final ym<vz, aed> a = yv.a(aed::a, aed::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aed(vz $$0) {
      this(new aga($$0), $$0.readByte());
   }

   private void a(vz $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public yx<aed> a() {
      return agd.ap;
   }

   public void a(abk $$0) {
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
