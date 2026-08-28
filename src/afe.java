public class afe implements zg<abu> {
   public static final yx<vw, afe> a = zg.a(afe::a, afe::new);
   private final float b;
   private final int c;
   private final float d;

   public afe(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afe(vw $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zi<afe> a() {
      return agg.aH;
   }

   public void a(abu $$0) {
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
