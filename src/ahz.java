public record ahz(int b, String c, int d, ahy e) implements zb<aic> {
   public static final ys<vu, ahz> a = zb.a(ahz::a, ahz::new);
   private static final int f = 255;

   @Deprecated
   public ahz(int b, String c, int d, ahy e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ahz(vu $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ahy.a($$0.l()));
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zd<ahz> a() {
      return aia.a;
   }

   public void a(aic $$0) {
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

   public ahy g() {
      return this.e;
   }
}
