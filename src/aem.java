public class aem implements yz<abk> {
   public static final yq<vs, aem> a = yz.a(aem::a, aem::new);
   private final im b;
   private final float c;

   public aem(im $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aem(vs $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zb<aem> a() {
      return afv.aA;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public im b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
