public class aej implements yp<aba> {
   public static final yg<vi, aej> a = yp.a(aej::a, aej::new);
   private final float b;
   private final int c;
   private final float d;

   public aej(float $$0, int $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aej(vi $$0) {
      this.b = $$0.readFloat();
      this.c = $$0.l();
      this.d = $$0.readFloat();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<aej> a() {
      return afl.aH;
   }

   public void a(aba $$0) {
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
