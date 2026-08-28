public class agf implements aac<acr> {
   public static final zt<ws, agf> a = aac.a(agf::a, agf::new);
   private final float b;
   private final int c;
   private final int d;

   public agf(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agf(ws $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(ws $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public aae<agf> a() {
      return ahk.aJ;
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

   public int f() {
      return this.d;
   }
}
