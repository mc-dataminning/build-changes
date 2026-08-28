public class adb implements zq<acf> {
   public static final zh<wg, adb> a = zq.a(adb::a, adb::new);
   private final int b;
   private final int c;
   private final int d;

   public adb(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adb(wg $$0) {
      this.b = $$0.x();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(wg $$0) {
      $$0.f(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
   }

   @Override
   public zs<adb> a() {
      return agu.v;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
