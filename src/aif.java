public record aif(int b, String c, int d, aie e) implements ze<aii> {
   public static final yv<vx, aif> a = ze.a(aif::a, aif::new);
   private static final int f = 255;

   @Deprecated
   public aif(int b, String c, int d, aie e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aif(vx $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aie.a($$0.l()));
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zg<aif> a() {
      return aig.a;
   }

   public void a(aii $$0) {
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

   public aie g() {
      return this.e;
   }
}
