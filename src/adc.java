public class adc implements xz<aai> {
   public static final xq<us, adc> a = xz.a(adc::a, adc::new);
   private final double b;
   private final double c;
   private final long d;

   public adc(dnv $$0) {
      this.b = $$0.i();
      this.c = $$0.k();
      this.d = $$0.j();
   }

   private adc(us $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.m();
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yb<adc> a() {
      return aet.as;
   }

   public void a(aai $$0) {
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
