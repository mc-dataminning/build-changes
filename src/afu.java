public class afu implements zr<acg> {
   public static final zi<wh, afu> a = zr.a(afu::a, afu::new);
   private final float b;
   private final int c;
   private final int d;

   public afu(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afu(wh $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(wh $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zt<afu> a() {
      return agz.aJ;
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

   public int f() {
      return this.d;
   }
}
