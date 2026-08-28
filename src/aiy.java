public record aiy(int b, String c, int d, aix e) implements zp<ajb> {
   public static final zg<wf, aiy> a = zp.a(aiy::a, aiy::new);
   private static final int f = 255;

   @Deprecated
   public aiy(int b, String c, int d, aix e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aiy(wf $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aix.a($$0.l()));
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zr<aiy> a() {
      return aiz.a;
   }

   public void a(ajb $$0) {
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

   public aix g() {
      return this.e;
   }
}
