public class aez implements yw<abl> {
   public static final yn<vl, aez> a = yw.a(aez::a, aez::new);
   private final float b;
   private final int c;
   private final int d;

   public aez(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aez(vl $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vl $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public yy<aez> a() {
      return age.aJ;
   }

   public void a(abl $$0) {
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
