public record ahn(int b, String c, int d, ahm e) implements yp<ahq> {
   public static final yg<vi, ahn> a = yp.a(ahn::a, ahn::new);
   private static final int f = 255;

   @Deprecated
   public ahn(int b, String c, int d, ahm e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ahn(vi $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ahm.a($$0.l()));
   }

   private void a(vi $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public yr<ahn> a() {
      return aho.a;
   }

   public void a(ahq $$0) {
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

   public ahm g() {
      return this.e;
   }
}
