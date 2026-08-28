public record ajf(int b, String c, int d, aje e) implements zr<aji> {
   public static final zi<wh, ajf> a = zr.a(ajf::a, ajf::new);
   private static final int f = 255;

   @Deprecated
   public ajf(int b, String c, int d, aje e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ajf(wh $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aje.a($$0.l()));
   }

   private void a(wh $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zt<ajf> a() {
      return ajg.a;
   }

   public void a(aji $$0) {
      $$0.a(this);
   }

   @Override
   public boolean d() {
      return true;
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public aje g() {
      return this.e;
   }
}
