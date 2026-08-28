public class afj implements zk<abz> {
   public static final zb<wa, afj> a = zk.a(afj::a, afj::new);
   private final float b;
   private final int c;
   private final int d;

   public afj(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afj(wa $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zm<afj> a() {
      return ago.aG;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public float b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
