public class afv implements zr<acg> {
   public static final zi<wh, afv> a = zr.a(afv::a, afv::new);
   private final float b;
   private final int c;
   private final float d;

   public afv(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afv(wh $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zt<afv> a() {
      return agz.aK;
   }

   public void a(acg $$0) {
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
