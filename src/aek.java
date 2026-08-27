public record aek(agg e, byte f) implements zl<abw> {
   public static final zc<wp, aek> a = zl.a(aek::a, aek::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aek(wp $$0) {
      this(new agg($$0), $$0.readByte());
   }

   private void a(wp $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public zn<aek> a() {
      return agj.am;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public agg b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
