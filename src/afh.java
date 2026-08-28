public class afh implements zf<abu> {
   public static final yw<vu, afh> a = zf.a(afh::a, afh::new);
   private final float b;
   private final int c;
   private final int d;

   public afh(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afh(vu $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zh<afh> a() {
      return agn.aJ;
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

   public int f() {
      return this.d;
   }
}
