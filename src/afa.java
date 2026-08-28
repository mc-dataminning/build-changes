public class afa implements yw<abl> {
   public static final yn<vl, afa> a = yw.a(afa::a, afa::new);
   private final float b;
   private final int c;
   private final float d;

   public afa(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afa(vl $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yy<afa> a() {
      return age.aK;
   }

   public void a(abl $$0) {
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
