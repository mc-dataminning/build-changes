public class afi implements zf<abu> {
   public static final yw<vu, afi> a = zf.a(afi::a, afi::new);
   private final float b;
   private final int c;
   private final float d;

   public afi(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afi(vu $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zh<afi> a() {
      return agn.aK;
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
