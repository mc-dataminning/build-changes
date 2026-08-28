public class aff implements zj<aby> {
   public static final za<vy, aff> a = zj.a(aff::a, aff::new);
   private final iw b;
   private final float c;

   public aff(iw $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aff(vy $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zl<aff> a() {
      return agr.aD;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public iw b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
