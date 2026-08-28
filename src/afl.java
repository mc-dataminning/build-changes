public class afl implements zj<aby> {
   public static final za<vy, afl> a = zj.a(afl::a, afl::new);
   private final float b;
   private final int c;
   private final int d;

   public afl(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afl(vy $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vy $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zl<afl> a() {
      return agr.aJ;
   }

   public void a(aby $$0) {
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
