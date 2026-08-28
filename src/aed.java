public class aed implements zp<ace> {
   public static final zg<wf, aed> a = zp.a(aed::a, aed::new);
   private final jh b;
   private final boolean c;

   public aed(jh $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aed(wf $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<aed> a() {
      return agt.Y;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
