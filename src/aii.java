public record aii(int b, String c, int d, aih e) implements zf<ail> {
   public static final yw<vv, aii> a = zf.a(aii::a, aii::new);
   private static final int f = 255;

   @Deprecated
   public aii(int b, String c, int d, aih e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aii(vv $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aih.a($$0.l()));
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zh<aii> a() {
      return aij.a;
   }

   public void a(ail $$0) {
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

   public aih g() {
      return this.e;
   }
}
