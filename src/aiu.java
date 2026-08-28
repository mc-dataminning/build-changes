public record aiu(int b, String c, int d, ait e) implements zl<aix> {
   public static final zc<wb, aiu> a = zl.a(aiu::a, aiu::new);
   private static final int f = 255;

   @Deprecated
   public aiu(int b, String c, int d, ait e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aiu(wb $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ait.a($$0.l()));
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zn<aiu> a() {
      return aiv.a;
   }

   public void a(aix $$0) {
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

   public ait g() {
      return this.e;
   }
}
