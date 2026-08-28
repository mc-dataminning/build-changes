public class ahr implements zk<agq> {
   public static final zb<wa, ahr> a = zk.a(ahr::a, ahr::new);
   private final boolean b;
   private final boolean c;

   public ahr(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahr(wa $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   @Override
   public zm<ahr> a() {
      return ago.bJ;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
