public record aie(int b, String c, int d, aid e) implements ze<aih> {
   public static final yv<vx, aie> a = ze.a(aie::a, aie::new);
   private static final int f = 255;

   @Deprecated
   public aie(int b, String c, int d, aid e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aie(vx $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aid.a($$0.l()));
   }

   private void a(vx $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zg<aie> a() {
      return aif.a;
   }

   public void a(aih $$0) {
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

   public aid g() {
      return this.e;
   }
}
