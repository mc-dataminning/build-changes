public record adc(int b, float c) implements zf<abt> {
   public static final yw<vv, adc> a = zf.a(adc::a, adc::new);

   public adc(btl $$0) {
      this($$0.an(), $$0.eF());
   }

   private adc(vv $$0) {
      this($$0.l(), $$0.readFloat());
   }

   private void a(vv $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<adc> a() {
      return agf.I;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }
}
