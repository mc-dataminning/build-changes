public class ack implements zj<aby> {
   public static final za<vy, ack> a = zj.a(ack::a, ack::new);
   private final buq b;
   private final boolean c;

   public ack(buq $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ack(vy $$0) {
      this.b = buq.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zl<ack> a() {
      return agr.l;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public buq e() {
      return this.b;
   }
}
