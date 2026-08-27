public class adu implements yb<aam> {
   public static final xs<uu, adu> a = yb.a(adu::a, adu::new);
   private final float b;
   private final int c;
   private final int d;

   public adu(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adu(uu $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public yd<adu> a() {
      return aex.aG;
   }

   public void a(aam $$0) {
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
