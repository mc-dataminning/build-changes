public class ady implements zk<abz> {
   public static final zb<wa, ady> a = zk.a(ady::a, ady::new);
   private final je b;
   private final boolean c;

   public ady(je $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ady(wa $$0) {
      this.b = $$0.e();
      this.c = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zm<ady> a() {
      return ago.Y;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
