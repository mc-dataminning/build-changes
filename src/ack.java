public class ack implements zo<acf> {
   public static final ze<vy, ack> a = zo.a(ack::a, ack::new);
   private final int b;
   private final iw c;
   private final int d;

   public ack(int $$0, iw $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ack(vy $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(vy $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.l(this.d);
   }

   @Override
   public zq<ack> a() {
      return agy.g;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iw e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
