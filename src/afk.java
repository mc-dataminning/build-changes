public class afk implements zk<abz> {
   public static final zb<wa, afk> a = zk.a(afk::a, afk::new);
   private final float b;
   private final int c;
   private final float d;

   public afk(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afk(wa $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wa $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zm<afk> a() {
      return ago.aH;
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

   public float f() {
      return this.d;
   }
}
