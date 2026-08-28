public class aiq implements zd<agn> {
   public static final yu<vs, aiq> a = zd.a(aiq::a, aiq::new);
   private final btx b;
   private final int c;
   private final float d;
   private final float e;

   public aiq(btx $$0, int $$1, float $$2, float $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   private aiq(vs $$0) {
      this.b = $$0.b(btx.class);
      this.c = $$0.l();
      this.d = $$0.readFloat();
      this.e = $$0.readFloat();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
   }

   @Override
   public zf<aiq> a() {
      return agl.co;
   }

   public void a(agn $$0) {
      $$0.a(this);
   }

   public btx b() {
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
