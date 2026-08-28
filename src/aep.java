public record aep(agm e, byte f) implements zl<aca> {
   public static final zc<wp, aep> a = zl.a(aep::a, aep::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aep(wp $$0) {
      this(new agm($$0), $$0.readByte());
   }

   private void a(wp $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zn<aep> a() {
      return agp.am;
   }

   public void a(aca $$0) {
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
