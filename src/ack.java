public class ack implements zl<abw> {
   public static final zc<we, ack> a = zl.a(ack::a, ack::new);
   private final bpx b;
   private final boolean c;

   public ack(bpx $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ack(we $$0) {
      this.b = bpx.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(we $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zn<ack> a() {
      return agj.n;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bpx e() {
      return this.b;
   }
}
