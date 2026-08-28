public class ahn implements zk<agq> {
   public static final zb<wa, ahn> a = zk.a(ahn::a, ahn::new);
   private final je b;
   private final int c;
   private final boolean d;

   public ahn(je $$0, int $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private ahn(wa $$0) {
      this.b = $$0.e();
      this.c = $$0.l();
      this.d = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<ahn> a() {
      return ago.bC;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
