public class ach implements yv<abk> {
   public static final ym<vz, ach> a = yv.a(ach::a, ach::new);
   private final int b;
   private final int c;
   private final int d;
   private final cwp e;

   public ach(int $$0, int $$1, int $$2, cwp $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private ach(vz $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cwp.g.decode($$0);
   }

   private void a(vz $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cwp.g.encode($$0, this.e);
   }

   @Override
   public yx<ach> a() {
      return agd.w;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cwp f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
