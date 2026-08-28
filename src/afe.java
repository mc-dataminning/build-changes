public class afe implements zl<aca> {
   public static final zc<wb, afe> a = zl.a(afe::a, afe::new);
   private final jf b;
   private final float c;

   public afe(jf $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afe(wb $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<afe> a() {
      return agp.aA;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public jf b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
