public class aix implements zs<agy> {
   public static final zj<wi, aix> a = zs.a(aix::a, aix::new);
   private final bsg b;
   private final int c;
   private final float d;
   private final float e;

   public aix(bsg $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aix(wi $$0) {
      this.b = $$0.b(bsg.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zu<aix> a() {
      return agw.cg;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public bsg b() {
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
