public class aei implements yp<aba> {
   public static final yg<vi, aei> a = yp.a(aei::a, aei::new);
   private final float b;
   private final int c;
   private final int d;

   public aei(float $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aei(vi $$0) {
      this.b = $$0.readFloat();
      this.d = $$0.l();
      this.c = $$0.l();
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.c(this.d);
      $$0.c(this.c);
   }

   @Override
   public yr<aei> a() {
      return afl.aG;
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

   public int f() {
      return this.d;
   }
}
