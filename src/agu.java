public class agu implements zk<agq> {
   public static final zb<wa, agu> a = zk.a(agu::a, agu::new);
   private final brh b;

   public agu(brh $$0) {
      this.b = $$0;
   }

   private agu(wa $$0) {
      this.b = brh.a($$0.readUnsignedByte());
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

   public brh b() {
      return this.b;
   }
}
