public class adv implements yb<aam> {
   public static final xs<uu, adv> a = yb.a(adv::a, adv::new);
   private final float b;
   private final int c;
   private final float d;

   public adv(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private adv(uu $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yd<adv> a() {
      return aex.aH;
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

   public float f() {
      return this.d;
   }
}
