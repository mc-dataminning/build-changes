public record ajp(int b, String c, int d, ajo e) implements aac<ajs> {
   public static final zt<ws, ajp> a = aac.a(ajp::a, ajp::new);
   private static final int f = 255;

   @Deprecated
   public ajp(int b, String c, int d, ajo e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ajp(ws $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ajo.a($$0.l()));
   }

   private void a(ws $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public aae<ajp> a() {
      return ajq.a;
   }

   public void a(ajs $$0) {
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

   public ajo g() {
      return this.e;
   }
}
