public class acm implements zk<abz> {
   public static final zb<wa, acm> a = zk.a(acm::a, acm::new);
   private final brm b;
   private final boolean c;

   public acm(brm $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acm(wa $$0) {
      this.b = brm.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zm<acm> a() {
      return ago.m;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public brm e() {
      return this.b;
   }
}
