public record ait(int b, String c, int d, ais e) implements zc<aiw> {
   public static final yt<vr, ait> a = zc.a(ait::a, ait::new);
   private static final int f = 255;

   @Deprecated
   public ait(int b, String c, int d, ais e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private ait(vr $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), ais.a($$0.l()));
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.m(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public ze<ait> a() {
      return aiu.a;
   }

   public void a(aiw $$0) {
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

   public ais g() {
      return this.e;
   }
}
