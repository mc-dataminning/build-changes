public class aed implements yz<abk> {
   public static final yq<vs, aed> a = yz.a(aed::a, aed::new);
   private final double b;
   private final double c;

   public aed(drp $$0) {
      this.b = $$0.a();
      this.c = $$0.b();
   }

   private aed(vs $$0) {
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<aed> a() {
      return afv.ar;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public double b() {
      return this.c;
   }

   public double e() {
      return this.b;
   }
}
