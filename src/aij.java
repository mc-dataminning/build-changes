public record aij(int b, String c, int d, aii e) implements zg<aim> {
   public static final yx<vw, aij> a = zg.a(aij::a, aij::new);
   private static final int f = 255;

   @Deprecated
   public aij(int b, String c, int d, aii e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aij(vw $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aii.a($$0.l()));
   }

   private void a(vw $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zi<aij> a() {
      return aik.a;
   }

   public void a(aim $$0) {
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

   public aii g() {
      return this.e;
   }
}
