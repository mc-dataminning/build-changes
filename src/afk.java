public class afk implements zl<aca> {
   public static final zc<wb, afk> a = zl.a(afk::a, afk::new);
   private final float b;
   private final int c;
   private final int d;

   public afk(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afk(wb $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zn<afk> a() {
      return agp.aG;
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

   public int f() {
      return this.d;
   }
}
