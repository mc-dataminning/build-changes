public class afi implements zp<ace> {
   public static final zg<wf, afi> a = zp.a(afi::a, afi::new);
   private final jh b;
   private final float c;

   public afi(jh $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afi(wf $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<afi> a() {
      return agt.aA;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
