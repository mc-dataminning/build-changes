public class adb implements zp<ace> {
   public static final zg<wt, adb> a = zp.a(adb::a, adb::new);
   private final int b;
   private final int c;
   private final int d;
   private final cwb e;

   public adb(int $$0, int $$1, int $$2, cwb $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private adb(wt $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cwb.h.decode($$0);
   }

   private void a(wt $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cwb.h.encode($$0, this.e);
   }

   @Override
   public zr<adb> a() {
      return agt.w;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cwb f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
