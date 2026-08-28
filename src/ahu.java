public class ahu implements zk<agq> {
   public static final zb<wa, ahu> a = zk.a(ahu::a, ahu::new);
   private static final int b = 2;
   private final boolean c;

   public ahu(cnm $$0) {
      this.c = $$0.b;
   }

   private ahu(wa $$0) {
      byte $$1 = $$0.readByte();
      this.c = ($$1 & 2) != 0;
   }

   private void a(wa $$0) {
      byte $$1 = 0;
      if (this.c) {
         $$1 = (byte)($$1 | 2);
      }

      $$0.l($$1);
   }

   @Override
   public zm<ahu> a() {
      return ago.bM;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }
}
