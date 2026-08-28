public record aiw(int b, String c, int d, aiv e) implements zf<aiz> {
   public static final yw<vu, aiw> a = zf.a(aiw::a, aiw::new);
   private static final int f = 255;

   @Deprecated
   public aiw(int b, String c, int d, aiv e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aiw(vu $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aiv.a($$0.l()));
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zh<aiw> a() {
      return aix.a;
   }

   public void a(aiz $$0) {
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

   public aiv g() {
      return this.e;
   }
}
