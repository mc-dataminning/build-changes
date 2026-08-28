public class add implements zr<acg> {
   public static final zi<wv, add> a = zr.a(add::a, add::new);
   private final int b;
   private final int c;
   private final int d;
   private final cxg e;

   public add(int $$0, int $$1, int $$2, cxg $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private add(wv $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cxg.g.decode($$0);
   }

   private void a(wv $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cxg.g.encode($$0, this.e);
   }

   @Override
   public zt<add> a() {
      return agz.w;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cxg f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
