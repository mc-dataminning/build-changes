public class ais implements zf<agp> {
   public static final yw<vu, ais> a = zf.a(ais::a, ais::new);
   private final bua b;
   private final int c;
   private final float d;
   private final float e;

   public ais(bua $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private ais(vu $$0) {
      this.b = $$0.b(bua.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zh<ais> a() {
      return agn.co;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public bua b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }

   public float g() {
      return this.e;
   }
}
