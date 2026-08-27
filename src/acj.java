public class acj implements zb<abm> {
   public static final ys<wf, acj> a = zb.a(acj::a, acj::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final csz g;

   public acj(int $$0, int $$1, int $$2, csz $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.r();
   }

   private acj(wf $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = csz.e.decode($$0);
   }

   private void a(wf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      csz.e.encode($$0, this.g);
   }

   @Override
   public zd<acj> a() {
      return afx.w;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public csz f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
