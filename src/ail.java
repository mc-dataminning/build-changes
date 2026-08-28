public record ail(int b, String c, int d, aik e) implements yw<aio> {
   public static final yn<vl, ail> a = yw.a(ail::a, ail::new);
   private static final int f = 255;

   @Deprecated
   public ail(int b, String c, int d, aik e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ail(vl $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aik.a($$0.l()));
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public yy<ail> a() {
      return aim.a;
   }

   public void a(aio $$0) {
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

   public aik g() {
      return this.e;
   }
}
