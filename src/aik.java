public record aik(int b, String c, int d, aij e) implements yw<ain> {
   public static final yn<vl, aik> a = yw.a(aik::a, aik::new);
   private static final int f = 255;

   @Deprecated
   public aik(int b, String c, int d, aij e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aik(vl $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aij.a($$0.l()));
   }

   private void a(vl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public yy<aik> a() {
      return ail.a;
   }

   public void a(ain $$0) {
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

   public aij g() {
      return this.e;
   }
}
