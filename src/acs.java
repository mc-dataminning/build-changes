public record acs(aen e, byte f) implements xx<aag> {
   public static final xo<uq, acs> a = xx.a(acs::a, acs::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private acs(uq $$0) {
      this(new aen($$0), $$0.readByte());
   }

   private void a(uq $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public xz<acs> a() {
      return aeq.ak;
   }

   public void a(aag $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public aen b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
