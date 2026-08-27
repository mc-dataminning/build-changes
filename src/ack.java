public class ack implements yb<aam> {
   public static final xs<uu, ack> a = yb.a(ack::a, ack::new);
   private final ib b;
   private final boolean c;

   public ack(ib $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ack(uu $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yd<ack> a() {
      return aex.X;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
