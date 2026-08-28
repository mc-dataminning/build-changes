public class aeo implements zg<abu> {
   public static final yx<vw, aeo> a = zg.a(aeo::a, aeo::new);
   private final double b;
   private final double c;

   public aeo(dut $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aeo(vw $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aeo> a() {
      return agg.ar;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
