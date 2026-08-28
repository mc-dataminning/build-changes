public class ada implements zo<acd> {
   public static final zf<ws, ada> a = zo.a(ada::a, ada::new);
   private final int b;
   private final int c;
   private final int d;
   private final cvx e;

   public ada(int $$0, int $$1, int $$2, cvx $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private ada(ws $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cvx.h.decode($$0);
   }

   private void a(ws $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cvx.h.encode($$0, this.e);
   }

   @Override
   public zq<ada> a() {
      return ags.w;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cvx f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
