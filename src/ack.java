public class ack implements zs<ace> {
   public static final zj<wl, ack> a = zs.a(ack::a, ack::new);
   private final int b;
   private final iz c;
   private final int d;

   public ack(int $$0, iz $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ack(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.e();
      this.d = $$0.readUnsignedByte();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.k(this.d);
   }

   @Override
   public zu<ack> a() {
      return agq.h;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public iz e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
