public record aic(int b, String c, int d, aib e) implements zb<aif> {
   public static final ys<vr, aic> a = zb.a(aic::a, aic::new);
   private static final int f = 255;

   @Deprecated
   public aic(int b, String c, int d, aib e) {
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
   }

   private aic(vr $$0) {
      this($$0.l(), $$0.d(255), $$0.readUnsignedShort(), aib.a($$0.l()));
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
      $$0.c(this.e.a());
   }

   @Override
   public zd<aic> a() {
      return aid.a;
   }

   public void a(aif $$0) {
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

   public aib g() {
      return this.e;
   }
}
