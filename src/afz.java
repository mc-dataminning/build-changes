public class afz implements aac<acr> {
   public static final zt<ws, afz> a = aac.a(afz::a, afz::new);
   private final jh b;
   private final float c;

   public afz(jh $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afz(ws $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public aae<afz> a() {
      return ahk.aD;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
