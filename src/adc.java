public class adc implements zr<acg> {
   public static final zi<wh, adc> a = zr.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final int d;

   public adc(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adc(wh $$0) {
      this.b = $$0.x();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(wh $$0) {
      $$0.f(this.b);
      $$0.m(this.c);
      $$0.m(this.d);
   }

   @Override
   public zt<adc> a() {
      return agz.v;
   }

   public void a(acg $$0) {
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
