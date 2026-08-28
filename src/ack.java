public class ack implements zp<ace> {
   public static final zg<wf, ack> a = zp.a(ack::a, ack::new);
   private final int b;
   private final jh c;
   private final int d;

   public ack(int $$0, jh $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ack(wf $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zr<ack> a() {
      return agt.h;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public jh e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
