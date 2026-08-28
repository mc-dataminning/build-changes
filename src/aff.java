public class aff implements zd<abs> {
   public static final yu<vs, aff> a = zd.a(aff::a, aff::new);
   private final float b;
   private final int c;
   private final int d;

   public aff(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aff(vs $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public zf<aff> a() {
      return agl.aJ;
   }

   public void a(abs $$0) {
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
