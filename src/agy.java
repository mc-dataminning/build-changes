public class agy implements zp<agv> {
   public static final zg<wf, agy> a = zp.a(agy::a, agy::new);
   private final int b;
   private final jh c;

   public agy(int $$0, jh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agy(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
   }

   @Override
   public zr<agy> a() {
      return agt.bh;
   }

   public void a(agv $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }
}
