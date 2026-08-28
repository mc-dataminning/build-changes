public class aep implements zk<abz> {
   public static final zb<wa, aep> a = zk.a(aep::a, aep::new);
   private final int b;
   private final byte c;

   public aep(btj $$0, byte $$1) {
      this.b = $$0.ap();
      this.c = $$1;
   }

   private aep(wa $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wa $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zm<aep> a() {
      return ago.an;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public btj a(dds $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
