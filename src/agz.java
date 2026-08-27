public record agz(int b, String c, int d, agy e) implements yb<ahc> {
   public static final xs<uu, agz> a = yb.a(agz::a, agz::new);
   private static final int f = 255;

   @Deprecated
   public agz(int b, String c, int d, agy e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private agz(uu $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), agy.a($$0.l()));
   }

   private void a(uu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public yd<agz> a() {
      return aha.a;
   }

   public void a(ahc $$0) {
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

   public agy g() {
      return this.e;
   }
}
