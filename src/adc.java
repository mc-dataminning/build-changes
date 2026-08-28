public class adc implements zw<aci> {
   public static final zn<wm, adc> a = zw.a(adc::a, adc::new);
   private final int b;

   public adc(int $$0) {
      this.b = $$0;
   }

   private adc(wm $$0) {
      this.b = $$0.readUnsignedByte();
   }

   private void a(wm $$0) {
      $$0.k(this.b);
   }

   @Override
   public zy<adc> a() {
      return agu.t;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }
}
