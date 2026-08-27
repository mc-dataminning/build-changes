public class aeo implements zb<abm> {
   public static final ys<vu, aeo> a = zb.a(aeo::a, aeo::new);
   private final in b;
   private final float c;

   public aeo(in $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aeo(vu $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aeo> a() {
      return afx.aA;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public in b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
