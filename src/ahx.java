public record ahx(int b, String c, int d, ahw e) implements yz<aia> {
   public static final yq<vs, ahx> a = yz.a(ahx::a, ahx::new);
   private static final int f = 255;

   @Deprecated
   public ahx(int b, String c, int d, ahw e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ahx(vs $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ahw.a($$0.l()));
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zb<ahx> a() {
      return ahy.a;
   }

   public void a(aia $$0) {
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

   public ahw g() {
      return this.e;
   }
}
