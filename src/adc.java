public class adc implements zf<abu> {
   public static final yw<vu, adc> a = zf.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final int d;

   public adc(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adc(vu $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(vu $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.q(this.d);
   }

   @Override
   public zh<adc> a() {
      return agn.H;
   }

   public void a(abu $$0) {
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
