public class aep implements zg<abu> {
   public static final yx<vw, aep> a = zg.a(aep::a, aep::new);
   private final double b;
   private final double c;
   private final long d;

   public aep(dut $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private aep(vw $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<aep> a() {
      return agg.as;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public long f() {
      return this.d;
   }
}
