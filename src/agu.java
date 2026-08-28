public class agu implements zk<agq> {
   public static final zb<wa, agu> a = zk.a(agu::a, agu::new);
   private final brm b;

   public agu(brm $$0) {
      this.b = $$0;
   }

   private agu(wa $$0) {
      this.b = brm.a($$0.readUnsignedByte());
   }

   private void a(wa $$0) {
      $$0.l(this.b.a());
   }

   @Override
   public zm<agu> a() {
      return ago.bj;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public brm b() {
      return this.b;
   }
}
