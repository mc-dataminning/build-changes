public class ado implements aac<acr> {
   public static final zt<xg, ado> a = aac.a(ado::a, ado::new);
   private final int b;
   private final int c;
   private final int d;
   private final cxp e;

   public ado(int $$0, int $$1, int $$2, cxp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private ado(xg $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cxp.g.decode($$0);
   }

   private void a(xg $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cxp.g.encode($$0, this.e);
   }

   @Override
   public aae<ado> a() {
      return ahk.w;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cxp f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
