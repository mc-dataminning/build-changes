public class aif implements zg<agi> {
   public static final yx<vw, aif> a = zg.a(aif::a, aif::new);
   private final bqq b;
   private final int c;
   private final float d;
   private final float e;

   public aif(bqq $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aif(vw $$0) {
      this.b = $$0.b(bqq.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zi<aif> a() {
      return agg.cd;
   }

   public void a(agi $$0) {
      $$0.a(this);
   }

   public bqq b() {
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
