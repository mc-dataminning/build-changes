public class acu implements zl<abw> {
   public static final zc<wp, acu> a = zl.a(acu::a, acu::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cuh g;

   public acu(int $$0, int $$1, int $$2, cuh $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.r();
   }

   private acu(wp $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cuh.e.decode($$0);
   }

   private void a(wp $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cuh.e.encode($$0, this.g);
   }

   @Override
   public zn<acu> a() {
      return agj.x;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cuh f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
