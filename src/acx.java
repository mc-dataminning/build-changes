public class acx implements zl<aca> {
   public static final zc<wp, acx> a = zl.a(acx::a, acx::new);
   private final int b;
   private final int c;
   private final int d;
   private final cvs e;

   public acx(int $$0, int $$1, int $$2, cvs $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.u();
   }

   private acx(wp $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cvs.h.decode($$0);
   }

   private void a(wp $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cvs.h.encode($$0, this.e);
   }

   @Override
   public zn<acx> a() {
      return agp.w;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cvs f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
