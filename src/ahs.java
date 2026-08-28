public class ahs implements zp<agv> {
   public static final zg<wf, ahs> a = zp.a(ahs::a, ahs::new);
   private final jh b;
   private final int c;
   private final boolean d;

   public ahs(jh $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahs(wf $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zr<ahs> a() {
      return agt.bC;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public jh b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
