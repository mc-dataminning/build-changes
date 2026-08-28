public class aiq implements zl<agr> {
   public static final zc<wb, aiq> a = zl.a(aiq::a, aiq::new);
   private final brr b;
   private final int c;
   private final float d;
   private final float e;

   public aiq(brr $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aiq(wb $$0) {
      this.b = $$0.b(brr.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(wb $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zn<aiq> a() {
      return agp.cg;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public brr b() {
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
