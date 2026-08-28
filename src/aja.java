public record aja(int b, String c, int d, aiz e) implements zj<ajd> {
   public static final za<vy, aja> a = zj.a(aja::a, aja::new);
   private static final int f = 255;

   @Deprecated
   public aja(int b, String c, int d, aiz e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aja(vy $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aiz.a($$0.l()));
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zl<aja> a() {
      return ajb.a;
   }

   public void a(ajd $$0) {
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

   public aiz g() {
      return this.e;
   }
}
