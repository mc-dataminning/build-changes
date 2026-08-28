public class adc implements zq<acf> {
   public static final zh<wu, adc> a = zq.a(adc::a, adc::new);
   private final int b;
   private final int c;
   private final int d;
   private final cwm e;

   public adc(int $$0, int $$1, int $$2, cwm $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3.v();
   }

   private adc(wu $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readShort();
      this.e = cwm.h.decode($$0);
   }

   private void a(wu $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.m(this.d);
      cwm.h.encode($$0, this.e);
   }

   @Override
   public zs<adc> a() {
      return agu.w;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.d;
   }

   public cwm f() {
      return this.e;
   }

   public int g() {
      return this.c;
   }
}
