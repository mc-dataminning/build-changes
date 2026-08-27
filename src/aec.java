public class aec implements yp<aba> {
   public static final yg<vi, aec> a = yp.a(aec::a, aec::new);
   private final id b;
   private final float c;

   public aec(id $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aec(vi $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<aec> a() {
      return afl.aA;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public id b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
