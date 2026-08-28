public class afq implements zq<acf> {
   public static final zh<wg, afq> a = zq.a(afq::a, afq::new);
   private final float b;
   private final int c;
   private final float d;

   public afq(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afq(wg $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zs<afq> a() {
      return agu.aH;
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

   public float f() {
      return this.d;
   }
}
