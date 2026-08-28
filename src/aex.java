public class aex implements zg<abu> {
   public static final yx<vw, aex> a = zg.a(aex::a, aex::new);
   private final jd b;
   private final float c;

   public aex(jd $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aex(vw $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zi<aex> a() {
      return agg.aA;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public jd b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
