public class aey implements yv<abk> {
   public static final ym<vl, aey> a = yv.a(aey::a, aey::new);
   private final float b;
   private final int c;
   private final int d;

   public aey(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aey(vl $$0) {
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
   public yx<aey> a() {
      return agd.aJ;
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

   public int f() {
      return this.d;
   }
}
