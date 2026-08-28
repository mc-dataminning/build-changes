public class aeq implements zb<abn> {
   public static final ys<vr, aeq> a = zb.a(aeq::a, aeq::new);
   private final ja b;
   private final float c;

   public aeq(ja $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aeq(vr $$0) {
      this.b = $$0.e();
      this.c = $$0.readFloat();
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<aeq> a() {
      return afz.aA;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public float e() {
      return this.c;
   }
}
