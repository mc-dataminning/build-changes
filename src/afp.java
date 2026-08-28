public class afp implements zq<acf> {
   public static final zh<wg, afp> a = zq.a(afp::a, afp::new);
   private final float b;
   private final int c;
   private final int d;

   public afp(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afp(wg $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zs<afp> a() {
      return agu.aG;
   }

   public void a(acf $$0) {
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
