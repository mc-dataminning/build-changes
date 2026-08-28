public class aez implements yv<abk> {
   public static final ym<vl, aez> a = yv.a(aez::a, aez::new);
   private final float b;
   private final int c;
   private final float d;

   public aez(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aez(vl $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yx<aez> a() {
      return agd.aK;
   }

   public void a(abk $$0) {
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
