public record aiz(int b, String c, int d, aiy e) implements zq<ajc> {
   public static final zh<wg, aiz> a = zq.a(aiz::a, aiz::new);
   private static final int f = 255;

   @Deprecated
   public aiz(int b, String c, int d, aiy e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aiz(wg $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aiy.a($$0.l()));
   }

   private void a(wg $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zs<aiz> a() {
      return aja.a;
   }

   public void a(ajc $$0) {
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

   public aiy g() {
      return this.e;
   }
}
