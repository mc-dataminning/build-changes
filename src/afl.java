public class afl implements zl<aca> {
   public static final zc<wb, afl> a = zl.a(afl::a, afl::new);
   private final float b;
   private final int c;
   private final float d;

   public afl(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afl(wb $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<afl> a() {
      return agp.aH;
   }

   public void a(aca $$0) {
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
