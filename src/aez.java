public class aez implements zd<abs> {
   public static final yu<vs, aez> a = zd.a(aez::a, aez::new);
   private final iu b;
   private final float c;

   public aez(iu $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aez(vs $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zf<aez> a() {
      return agl.aD;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public iu b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
