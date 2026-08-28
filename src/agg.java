public class agg implements aac<acr> {
   public static final zt<ws, agg> a = aac.a(agg::a, agg::new);
   private final float b;
   private final int c;
   private final float d;

   public agg(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agg(ws $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public aae<agg> a() {
      return ahk.aK;
   }

   public void a(acr $$0) {
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
