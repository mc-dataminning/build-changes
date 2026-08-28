public record aei(agd e, byte f) implements zg<abu> {
   public static final yx<wk, aei> a = zg.a(aei::a, aei::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aei(wk $$0) {
      this(new agd($$0), $$0.readByte());
   }

   private void a(wk $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zi<aei> a() {
      return agg.al;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agd b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
