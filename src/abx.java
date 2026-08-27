public class abx implements yp<aba> {
   public static final yg<vt, abx> a = yp.a(abx::a, abx::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final crs g;

   public abx(int $$0, int $$1, int $$2, crs $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.r();
   }

   private abx(vt $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = crs.e.decode($$0);
   }

   private void a(vt $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      crs.e.encode($$0, this.g);
   }

   @Override
   public yr<abx> a() {
      return afl.w;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public crs f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
