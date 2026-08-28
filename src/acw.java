public class acw implements zk<abz> {
   public static final zb<wo, acw> a = zk.a(acw::a, acw::new);
   private final int b;
   private final int c;
   private final int d;
   private final cvp e;

   public acw(int $$0, int $$1, int $$2, cvp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.u();
   }

   private acw(wo $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cvp.h.decode($$0);
   }

   private void a(wo $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cvp.h.encode($$0, this.e);
   }

   @Override
   public zm<acw> a() {
      return ago.w;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cvp f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
